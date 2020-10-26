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

@Tag("5")
class Record_4484 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4484: FirstName is Anne")
	void FirstNameOfRecord4484() {
		assertEquals("Anne", customers.get(4483).getFirstName());
	}

	@Test
	@DisplayName("Record 4484: LastName is Galentine")
	void LastNameOfRecord4484() {
		assertEquals("Galentine", customers.get(4483).getLastName());
	}

	@Test
	@DisplayName("Record 4484: Company is Alicai Comforts")
	void CompanyOfRecord4484() {
		assertEquals("Alicai Comforts", customers.get(4483).getCompany());
	}

	@Test
	@DisplayName("Record 4484: Address is 500 Coffee Rd  #-b")
	void AddressOfRecord4484() {
		assertEquals("500 Coffee Rd  #-b", customers.get(4483).getAddress());
	}

	@Test
	@DisplayName("Record 4484: City is Modesto")
	void CityOfRecord4484() {
		assertEquals("Modesto", customers.get(4483).getCity());
	}

	@Test
	@DisplayName("Record 4484: County is Stanislaus")
	void CountyOfRecord4484() {
		assertEquals("Stanislaus", customers.get(4483).getCounty());
	}

	@Test
	@DisplayName("Record 4484: State is CA")
	void StateOfRecord4484() {
		assertEquals("CA", customers.get(4483).getState());
	}

	@Test
	@DisplayName("Record 4484: ZIP is 95355")
	void ZIPOfRecord4484() {
		assertEquals("95355", customers.get(4483).getZIP());
	}

	@Test
	@DisplayName("Record 4484: Phone is 209-576-0675")
	void PhoneOfRecord4484() {
		assertEquals("209-576-0675", customers.get(4483).getPhone());
	}

	@Test
	@DisplayName("Record 4484: Fax is 209-576-3904")
	void FaxOfRecord4484() {
		assertEquals("209-576-3904", customers.get(4483).getFax());
	}

	@Test
	@DisplayName("Record 4484: Email is anne@galentine.com")
	void EmailOfRecord4484() {
		assertEquals("anne@galentine.com", customers.get(4483).getEmail());
	}

	@Test
	@DisplayName("Record 4484: Web is http://www.annegalentine.com")
	void WebOfRecord4484() {
		assertEquals("http://www.annegalentine.com", customers.get(4483).getWeb());
	}
}
