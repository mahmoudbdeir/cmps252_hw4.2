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

@Tag("30")
class Record_887 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 887: FirstName is Glenn")
	void FirstNameOfRecord887() {
		assertEquals("Glenn", customers.get(886).getFirstName());
	}

	@Test
	@DisplayName("Record 887: LastName is Oballe")
	void LastNameOfRecord887() {
		assertEquals("Oballe", customers.get(886).getLastName());
	}

	@Test
	@DisplayName("Record 887: Company is Industrial Crane Rental Inc")
	void CompanyOfRecord887() {
		assertEquals("Industrial Crane Rental Inc", customers.get(886).getCompany());
	}

	@Test
	@DisplayName("Record 887: Address is 257 Bonnabel Blvd")
	void AddressOfRecord887() {
		assertEquals("257 Bonnabel Blvd", customers.get(886).getAddress());
	}

	@Test
	@DisplayName("Record 887: City is Metairie")
	void CityOfRecord887() {
		assertEquals("Metairie", customers.get(886).getCity());
	}

	@Test
	@DisplayName("Record 887: County is Jefferson")
	void CountyOfRecord887() {
		assertEquals("Jefferson", customers.get(886).getCounty());
	}

	@Test
	@DisplayName("Record 887: State is LA")
	void StateOfRecord887() {
		assertEquals("LA", customers.get(886).getState());
	}

	@Test
	@DisplayName("Record 887: ZIP is 70005")
	void ZIPOfRecord887() {
		assertEquals("70005", customers.get(886).getZIP());
	}

	@Test
	@DisplayName("Record 887: Phone is 504-834-6395")
	void PhoneOfRecord887() {
		assertEquals("504-834-6395", customers.get(886).getPhone());
	}

	@Test
	@DisplayName("Record 887: Fax is 504-834-1896")
	void FaxOfRecord887() {
		assertEquals("504-834-1896", customers.get(886).getFax());
	}

	@Test
	@DisplayName("Record 887: Email is glenn@oballe.com")
	void EmailOfRecord887() {
		assertEquals("glenn@oballe.com", customers.get(886).getEmail());
	}

	@Test
	@DisplayName("Record 887: Web is http://www.glennoballe.com")
	void WebOfRecord887() {
		assertEquals("http://www.glennoballe.com", customers.get(886).getWeb());
	}
}
