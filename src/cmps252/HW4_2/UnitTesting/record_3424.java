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

@Tag("17")
class Record_3424 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3424: FirstName is Angelita")
	void FirstNameOfRecord3424() {
		assertEquals("Angelita", customers.get(3423).getFirstName());
	}

	@Test
	@DisplayName("Record 3424: LastName is Elzinga")
	void LastNameOfRecord3424() {
		assertEquals("Elzinga", customers.get(3423).getLastName());
	}

	@Test
	@DisplayName("Record 3424: Company is Wolfe, Thomas G Esq")
	void CompanyOfRecord3424() {
		assertEquals("Wolfe, Thomas G Esq", customers.get(3423).getCompany());
	}

	@Test
	@DisplayName("Record 3424: Address is 213 Southern Blvd")
	void AddressOfRecord3424() {
		assertEquals("213 Southern Blvd", customers.get(3423).getAddress());
	}

	@Test
	@DisplayName("Record 3424: City is West Palm Beach")
	void CityOfRecord3424() {
		assertEquals("West Palm Beach", customers.get(3423).getCity());
	}

	@Test
	@DisplayName("Record 3424: County is Palm Beach")
	void CountyOfRecord3424() {
		assertEquals("Palm Beach", customers.get(3423).getCounty());
	}

	@Test
	@DisplayName("Record 3424: State is FL")
	void StateOfRecord3424() {
		assertEquals("FL", customers.get(3423).getState());
	}

	@Test
	@DisplayName("Record 3424: ZIP is 33405")
	void ZIPOfRecord3424() {
		assertEquals("33405", customers.get(3423).getZIP());
	}

	@Test
	@DisplayName("Record 3424: Phone is 561-833-5008")
	void PhoneOfRecord3424() {
		assertEquals("561-833-5008", customers.get(3423).getPhone());
	}

	@Test
	@DisplayName("Record 3424: Fax is 561-833-1359")
	void FaxOfRecord3424() {
		assertEquals("561-833-1359", customers.get(3423).getFax());
	}

	@Test
	@DisplayName("Record 3424: Email is angelita@elzinga.com")
	void EmailOfRecord3424() {
		assertEquals("angelita@elzinga.com", customers.get(3423).getEmail());
	}

	@Test
	@DisplayName("Record 3424: Web is http://www.angelitaelzinga.com")
	void WebOfRecord3424() {
		assertEquals("http://www.angelitaelzinga.com", customers.get(3423).getWeb());
	}
}
