package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("6")
class Record_3630 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3630: FirstName is yleen")
	void FirstNameOfRecord3630() {
		assertEquals("yleen", customers.get(3629).getFirstName());
	}

	@Test
	@DisplayName("Record 3630: LastName is Radosevich")
	void LastNameOfRecord3630() {
		assertEquals("Radosevich", customers.get(3629).getLastName());
	}

	@Test
	@DisplayName("Record 3630: Company is Empire Of Carolina Inc")
	void CompanyOfRecord3630() {
		assertEquals("Empire Of Carolina Inc", customers.get(3629).getCompany());
	}

	@Test
	@DisplayName("Record 3630: Address is 48 E Walnut St")
	void AddressOfRecord3630() {
		assertEquals("48 E Walnut St", customers.get(3629).getAddress());
	}

	@Test
	@DisplayName("Record 3630: City is Hagerstown")
	void CityOfRecord3630() {
		assertEquals("Hagerstown", customers.get(3629).getCity());
	}

	@Test
	@DisplayName("Record 3630: County is Wayne")
	void CountyOfRecord3630() {
		assertEquals("Wayne", customers.get(3629).getCounty());
	}

	@Test
	@DisplayName("Record 3630: State is IN")
	void StateOfRecord3630() {
		assertEquals("IN", customers.get(3629).getState());
	}

	@Test
	@DisplayName("Record 3630: ZIP is 47346")
	void ZIPOfRecord3630() {
		assertEquals("47346", customers.get(3629).getZIP());
	}

	@Test
	@DisplayName("Record 3630: Phone is 765-489-0879")
	void PhoneOfRecord3630() {
		assertEquals("765-489-0879", customers.get(3629).getPhone());
	}

	@Test
	@DisplayName("Record 3630: Fax is 765-489-6597")
	void FaxOfRecord3630() {
		assertEquals("765-489-6597", customers.get(3629).getFax());
	}

	@Test
	@DisplayName("Record 3630: Email is yleen@radosevich.com")
	void EmailOfRecord3630() {
		assertEquals("yleen@radosevich.com", customers.get(3629).getEmail());
	}

	@Test
	@DisplayName("Record 3630: Web is http://www.yleenradosevich.com")
	void WebOfRecord3630() {
		assertEquals("http://www.yleenradosevich.com", customers.get(3629).getWeb());
	}
}
