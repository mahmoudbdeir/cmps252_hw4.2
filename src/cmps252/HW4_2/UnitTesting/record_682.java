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

@Tag("29")
class Record_682 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 682: FirstName is Vaughn")
	void FirstNameOfRecord682() {
		assertEquals("Vaughn", customers.get(681).getFirstName());
	}

	@Test
	@DisplayName("Record 682: LastName is Nuding")
	void LastNameOfRecord682() {
		assertEquals("Nuding", customers.get(681).getLastName());
	}

	@Test
	@DisplayName("Record 682: Company is Inouye & Ogden")
	void CompanyOfRecord682() {
		assertEquals("Inouye & Ogden", customers.get(681).getCompany());
	}

	@Test
	@DisplayName("Record 682: Address is 7464 W Belmont Ave")
	void AddressOfRecord682() {
		assertEquals("7464 W Belmont Ave", customers.get(681).getAddress());
	}

	@Test
	@DisplayName("Record 682: City is Chicago")
	void CityOfRecord682() {
		assertEquals("Chicago", customers.get(681).getCity());
	}

	@Test
	@DisplayName("Record 682: County is Cook")
	void CountyOfRecord682() {
		assertEquals("Cook", customers.get(681).getCounty());
	}

	@Test
	@DisplayName("Record 682: State is IL")
	void StateOfRecord682() {
		assertEquals("IL", customers.get(681).getState());
	}

	@Test
	@DisplayName("Record 682: ZIP is 60634")
	void ZIPOfRecord682() {
		assertEquals("60634", customers.get(681).getZIP());
	}

	@Test
	@DisplayName("Record 682: Phone is 773-589-5428")
	void PhoneOfRecord682() {
		assertEquals("773-589-5428", customers.get(681).getPhone());
	}

	@Test
	@DisplayName("Record 682: Fax is 773-589-0054")
	void FaxOfRecord682() {
		assertEquals("773-589-0054", customers.get(681).getFax());
	}

	@Test
	@DisplayName("Record 682: Email is vaughn@nuding.com")
	void EmailOfRecord682() {
		assertEquals("vaughn@nuding.com", customers.get(681).getEmail());
	}

	@Test
	@DisplayName("Record 682: Web is http://www.vaughnnuding.com")
	void WebOfRecord682() {
		assertEquals("http://www.vaughnnuding.com", customers.get(681).getWeb());
	}
}
