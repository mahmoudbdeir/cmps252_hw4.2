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

@Tag("34")
class Record_3633 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3633: FirstName is Charlie")
	void FirstNameOfRecord3633() {
		assertEquals("Charlie", customers.get(3632).getFirstName());
	}

	@Test
	@DisplayName("Record 3633: LastName is Huebert")
	void LastNameOfRecord3633() {
		assertEquals("Huebert", customers.get(3632).getLastName());
	}

	@Test
	@DisplayName("Record 3633: Company is I A C Intrntl Art Collcts")
	void CompanyOfRecord3633() {
		assertEquals("I A C Intrntl Art Collcts", customers.get(3632).getCompany());
	}

	@Test
	@DisplayName("Record 3633: Address is 2195 Empire Blvd")
	void AddressOfRecord3633() {
		assertEquals("2195 Empire Blvd", customers.get(3632).getAddress());
	}

	@Test
	@DisplayName("Record 3633: City is Webster")
	void CityOfRecord3633() {
		assertEquals("Webster", customers.get(3632).getCity());
	}

	@Test
	@DisplayName("Record 3633: County is Monroe")
	void CountyOfRecord3633() {
		assertEquals("Monroe", customers.get(3632).getCounty());
	}

	@Test
	@DisplayName("Record 3633: State is NY")
	void StateOfRecord3633() {
		assertEquals("NY", customers.get(3632).getState());
	}

	@Test
	@DisplayName("Record 3633: ZIP is 14580")
	void ZIPOfRecord3633() {
		assertEquals("14580", customers.get(3632).getZIP());
	}

	@Test
	@DisplayName("Record 3633: Phone is 585-865-0516")
	void PhoneOfRecord3633() {
		assertEquals("585-865-0516", customers.get(3632).getPhone());
	}

	@Test
	@DisplayName("Record 3633: Fax is 585-865-7069")
	void FaxOfRecord3633() {
		assertEquals("585-865-7069", customers.get(3632).getFax());
	}

	@Test
	@DisplayName("Record 3633: Email is charlie@huebert.com")
	void EmailOfRecord3633() {
		assertEquals("charlie@huebert.com", customers.get(3632).getEmail());
	}

	@Test
	@DisplayName("Record 3633: Web is http://www.charliehuebert.com")
	void WebOfRecord3633() {
		assertEquals("http://www.charliehuebert.com", customers.get(3632).getWeb());
	}
}
