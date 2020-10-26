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
class Record_3898 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3898: FirstName is Otto")
	void FirstNameOfRecord3898() {
		assertEquals("Otto", customers.get(3897).getFirstName());
	}

	@Test
	@DisplayName("Record 3898: LastName is Inclan")
	void LastNameOfRecord3898() {
		assertEquals("Inclan", customers.get(3897).getLastName());
	}

	@Test
	@DisplayName("Record 3898: Company is Sumitomo Electric")
	void CompanyOfRecord3898() {
		assertEquals("Sumitomo Electric", customers.get(3897).getCompany());
	}

	@Test
	@DisplayName("Record 3898: Address is 111 Santa Rosa Ave")
	void AddressOfRecord3898() {
		assertEquals("111 Santa Rosa Ave", customers.get(3897).getAddress());
	}

	@Test
	@DisplayName("Record 3898: City is Santa Rosa")
	void CityOfRecord3898() {
		assertEquals("Santa Rosa", customers.get(3897).getCity());
	}

	@Test
	@DisplayName("Record 3898: County is Sonoma")
	void CountyOfRecord3898() {
		assertEquals("Sonoma", customers.get(3897).getCounty());
	}

	@Test
	@DisplayName("Record 3898: State is CA")
	void StateOfRecord3898() {
		assertEquals("CA", customers.get(3897).getState());
	}

	@Test
	@DisplayName("Record 3898: ZIP is 95404")
	void ZIPOfRecord3898() {
		assertEquals("95404", customers.get(3897).getZIP());
	}

	@Test
	@DisplayName("Record 3898: Phone is 707-526-9264")
	void PhoneOfRecord3898() {
		assertEquals("707-526-9264", customers.get(3897).getPhone());
	}

	@Test
	@DisplayName("Record 3898: Fax is 707-526-1375")
	void FaxOfRecord3898() {
		assertEquals("707-526-1375", customers.get(3897).getFax());
	}

	@Test
	@DisplayName("Record 3898: Email is otto@inclan.com")
	void EmailOfRecord3898() {
		assertEquals("otto@inclan.com", customers.get(3897).getEmail());
	}

	@Test
	@DisplayName("Record 3898: Web is http://www.ottoinclan.com")
	void WebOfRecord3898() {
		assertEquals("http://www.ottoinclan.com", customers.get(3897).getWeb());
	}
}
