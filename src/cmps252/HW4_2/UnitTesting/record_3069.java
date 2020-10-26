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

@Tag("44")
class Record_3069 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3069: FirstName is Pamala")
	void FirstNameOfRecord3069() {
		assertEquals("Pamala", customers.get(3068).getFirstName());
	}

	@Test
	@DisplayName("Record 3069: LastName is Chavaria")
	void LastNameOfRecord3069() {
		assertEquals("Chavaria", customers.get(3068).getLastName());
	}

	@Test
	@DisplayName("Record 3069: Company is Fynkost Ingredients")
	void CompanyOfRecord3069() {
		assertEquals("Fynkost Ingredients", customers.get(3068).getCompany());
	}

	@Test
	@DisplayName("Record 3069: Address is 146 South Blvd")
	void AddressOfRecord3069() {
		assertEquals("146 South Blvd", customers.get(3068).getAddress());
	}

	@Test
	@DisplayName("Record 3069: City is San Mateo")
	void CityOfRecord3069() {
		assertEquals("San Mateo", customers.get(3068).getCity());
	}

	@Test
	@DisplayName("Record 3069: County is San Mateo")
	void CountyOfRecord3069() {
		assertEquals("San Mateo", customers.get(3068).getCounty());
	}

	@Test
	@DisplayName("Record 3069: State is CA")
	void StateOfRecord3069() {
		assertEquals("CA", customers.get(3068).getState());
	}

	@Test
	@DisplayName("Record 3069: ZIP is 94402")
	void ZIPOfRecord3069() {
		assertEquals("94402", customers.get(3068).getZIP());
	}

	@Test
	@DisplayName("Record 3069: Phone is 650-345-3792")
	void PhoneOfRecord3069() {
		assertEquals("650-345-3792", customers.get(3068).getPhone());
	}

	@Test
	@DisplayName("Record 3069: Fax is 650-345-2363")
	void FaxOfRecord3069() {
		assertEquals("650-345-2363", customers.get(3068).getFax());
	}

	@Test
	@DisplayName("Record 3069: Email is pamala@chavaria.com")
	void EmailOfRecord3069() {
		assertEquals("pamala@chavaria.com", customers.get(3068).getEmail());
	}

	@Test
	@DisplayName("Record 3069: Web is http://www.pamalachavaria.com")
	void WebOfRecord3069() {
		assertEquals("http://www.pamalachavaria.com", customers.get(3068).getWeb());
	}
}
