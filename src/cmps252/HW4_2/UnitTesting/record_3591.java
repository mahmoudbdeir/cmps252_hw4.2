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

@Tag("43")
class Record_3591 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3591: FirstName is Shirley")
	void FirstNameOfRecord3591() {
		assertEquals("Shirley", customers.get(3590).getFirstName());
	}

	@Test
	@DisplayName("Record 3591: LastName is Huhman")
	void LastNameOfRecord3591() {
		assertEquals("Huhman", customers.get(3590).getLastName());
	}

	@Test
	@DisplayName("Record 3591: Company is H J Gasser Co Inc")
	void CompanyOfRecord3591() {
		assertEquals("H J Gasser Co Inc", customers.get(3590).getCompany());
	}

	@Test
	@DisplayName("Record 3591: Address is 1 Woodward Ave")
	void AddressOfRecord3591() {
		assertEquals("1 Woodward Ave", customers.get(3590).getAddress());
	}

	@Test
	@DisplayName("Record 3591: City is Detroit")
	void CityOfRecord3591() {
		assertEquals("Detroit", customers.get(3590).getCity());
	}

	@Test
	@DisplayName("Record 3591: County is Wayne")
	void CountyOfRecord3591() {
		assertEquals("Wayne", customers.get(3590).getCounty());
	}

	@Test
	@DisplayName("Record 3591: State is MI")
	void StateOfRecord3591() {
		assertEquals("MI", customers.get(3590).getState());
	}

	@Test
	@DisplayName("Record 3591: ZIP is 48226")
	void ZIPOfRecord3591() {
		assertEquals("48226", customers.get(3590).getZIP());
	}

	@Test
	@DisplayName("Record 3591: Phone is 313-963-2743")
	void PhoneOfRecord3591() {
		assertEquals("313-963-2743", customers.get(3590).getPhone());
	}

	@Test
	@DisplayName("Record 3591: Fax is 313-963-8378")
	void FaxOfRecord3591() {
		assertEquals("313-963-8378", customers.get(3590).getFax());
	}

	@Test
	@DisplayName("Record 3591: Email is shirley@huhman.com")
	void EmailOfRecord3591() {
		assertEquals("shirley@huhman.com", customers.get(3590).getEmail());
	}

	@Test
	@DisplayName("Record 3591: Web is http://www.shirleyhuhman.com")
	void WebOfRecord3591() {
		assertEquals("http://www.shirleyhuhman.com", customers.get(3590).getWeb());
	}
}
