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

@Tag("32")
class Record_3909 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3909: FirstName is Eugenia")
	void FirstNameOfRecord3909() {
		assertEquals("Eugenia", customers.get(3908).getFirstName());
	}

	@Test
	@DisplayName("Record 3909: LastName is Embelton")
	void LastNameOfRecord3909() {
		assertEquals("Embelton", customers.get(3908).getLastName());
	}

	@Test
	@DisplayName("Record 3909: Company is D M Rudolph Agencies Inc")
	void CompanyOfRecord3909() {
		assertEquals("D M Rudolph Agencies Inc", customers.get(3908).getCompany());
	}

	@Test
	@DisplayName("Record 3909: Address is 230 N Elm St")
	void AddressOfRecord3909() {
		assertEquals("230 N Elm St", customers.get(3908).getAddress());
	}

	@Test
	@DisplayName("Record 3909: City is Greensboro")
	void CityOfRecord3909() {
		assertEquals("Greensboro", customers.get(3908).getCity());
	}

	@Test
	@DisplayName("Record 3909: County is Guilford")
	void CountyOfRecord3909() {
		assertEquals("Guilford", customers.get(3908).getCounty());
	}

	@Test
	@DisplayName("Record 3909: State is NC")
	void StateOfRecord3909() {
		assertEquals("NC", customers.get(3908).getState());
	}

	@Test
	@DisplayName("Record 3909: ZIP is 27401")
	void ZIPOfRecord3909() {
		assertEquals("27401", customers.get(3908).getZIP());
	}

	@Test
	@DisplayName("Record 3909: Phone is 336-370-4879")
	void PhoneOfRecord3909() {
		assertEquals("336-370-4879", customers.get(3908).getPhone());
	}

	@Test
	@DisplayName("Record 3909: Fax is 336-370-1408")
	void FaxOfRecord3909() {
		assertEquals("336-370-1408", customers.get(3908).getFax());
	}

	@Test
	@DisplayName("Record 3909: Email is eugenia@embelton.com")
	void EmailOfRecord3909() {
		assertEquals("eugenia@embelton.com", customers.get(3908).getEmail());
	}

	@Test
	@DisplayName("Record 3909: Web is http://www.eugeniaembelton.com")
	void WebOfRecord3909() {
		assertEquals("http://www.eugeniaembelton.com", customers.get(3908).getWeb());
	}
}
