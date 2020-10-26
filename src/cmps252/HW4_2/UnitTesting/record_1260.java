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

@Tag("12")
class Record_1260 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1260: FirstName is Tory")
	void FirstNameOfRecord1260() {
		assertEquals("Tory", customers.get(1259).getFirstName());
	}

	@Test
	@DisplayName("Record 1260: LastName is Resue")
	void LastNameOfRecord1260() {
		assertEquals("Resue", customers.get(1259).getLastName());
	}

	@Test
	@DisplayName("Record 1260: Company is N Y Sabtex Ltd")
	void CompanyOfRecord1260() {
		assertEquals("N Y Sabtex Ltd", customers.get(1259).getCompany());
	}

	@Test
	@DisplayName("Record 1260: Address is 730 E Brevard St")
	void AddressOfRecord1260() {
		assertEquals("730 E Brevard St", customers.get(1259).getAddress());
	}

	@Test
	@DisplayName("Record 1260: City is Tallahassee")
	void CityOfRecord1260() {
		assertEquals("Tallahassee", customers.get(1259).getCity());
	}

	@Test
	@DisplayName("Record 1260: County is Leon")
	void CountyOfRecord1260() {
		assertEquals("Leon", customers.get(1259).getCounty());
	}

	@Test
	@DisplayName("Record 1260: State is FL")
	void StateOfRecord1260() {
		assertEquals("FL", customers.get(1259).getState());
	}

	@Test
	@DisplayName("Record 1260: ZIP is 32308")
	void ZIPOfRecord1260() {
		assertEquals("32308", customers.get(1259).getZIP());
	}

	@Test
	@DisplayName("Record 1260: Phone is 850-222-0503")
	void PhoneOfRecord1260() {
		assertEquals("850-222-0503", customers.get(1259).getPhone());
	}

	@Test
	@DisplayName("Record 1260: Fax is 850-222-4816")
	void FaxOfRecord1260() {
		assertEquals("850-222-4816", customers.get(1259).getFax());
	}

	@Test
	@DisplayName("Record 1260: Email is tory@resue.com")
	void EmailOfRecord1260() {
		assertEquals("tory@resue.com", customers.get(1259).getEmail());
	}

	@Test
	@DisplayName("Record 1260: Web is http://www.toryresue.com")
	void WebOfRecord1260() {
		assertEquals("http://www.toryresue.com", customers.get(1259).getWeb());
	}
}
