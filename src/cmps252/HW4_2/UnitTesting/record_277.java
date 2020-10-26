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

@Tag("47")
class Record_277 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 277: FirstName is Kendra")
	void FirstNameOfRecord277() {
		assertEquals("Kendra", customers.get(276).getFirstName());
	}

	@Test
	@DisplayName("Record 277: LastName is Giancaspro")
	void LastNameOfRecord277() {
		assertEquals("Giancaspro", customers.get(276).getLastName());
	}

	@Test
	@DisplayName("Record 277: Company is Jedco Printing Co")
	void CompanyOfRecord277() {
		assertEquals("Jedco Printing Co", customers.get(276).getCompany());
	}

	@Test
	@DisplayName("Record 277: Address is Box #-2029")
	void AddressOfRecord277() {
		assertEquals("Box #-2029", customers.get(276).getAddress());
	}

	@Test
	@DisplayName("Record 277: City is Upland")
	void CityOfRecord277() {
		assertEquals("Upland", customers.get(276).getCity());
	}

	@Test
	@DisplayName("Record 277: County is San Bernardino")
	void CountyOfRecord277() {
		assertEquals("San Bernardino", customers.get(276).getCounty());
	}

	@Test
	@DisplayName("Record 277: State is CA")
	void StateOfRecord277() {
		assertEquals("CA", customers.get(276).getState());
	}

	@Test
	@DisplayName("Record 277: ZIP is 91785")
	void ZIPOfRecord277() {
		assertEquals("91785", customers.get(276).getZIP());
	}

	@Test
	@DisplayName("Record 277: Phone is 909-946-2016")
	void PhoneOfRecord277() {
		assertEquals("909-946-2016", customers.get(276).getPhone());
	}

	@Test
	@DisplayName("Record 277: Fax is 909-946-7299")
	void FaxOfRecord277() {
		assertEquals("909-946-7299", customers.get(276).getFax());
	}

	@Test
	@DisplayName("Record 277: Email is kendra@giancaspro.com")
	void EmailOfRecord277() {
		assertEquals("kendra@giancaspro.com", customers.get(276).getEmail());
	}

	@Test
	@DisplayName("Record 277: Web is http://www.kendragiancaspro.com")
	void WebOfRecord277() {
		assertEquals("http://www.kendragiancaspro.com", customers.get(276).getWeb());
	}
}
