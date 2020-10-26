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

@Tag("41")
class Record_4901 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4901: FirstName is Tessa")
	void FirstNameOfRecord4901() {
		assertEquals("Tessa", customers.get(4900).getFirstName());
	}

	@Test
	@DisplayName("Record 4901: LastName is Chiquito")
	void LastNameOfRecord4901() {
		assertEquals("Chiquito", customers.get(4900).getLastName());
	}

	@Test
	@DisplayName("Record 4901: Company is Gilden T Tax Service")
	void CompanyOfRecord4901() {
		assertEquals("Gilden T Tax Service", customers.get(4900).getCompany());
	}

	@Test
	@DisplayName("Record 4901: Address is 501 Herndon Ave")
	void AddressOfRecord4901() {
		assertEquals("501 Herndon Ave", customers.get(4900).getAddress());
	}

	@Test
	@DisplayName("Record 4901: City is Orlando")
	void CityOfRecord4901() {
		assertEquals("Orlando", customers.get(4900).getCity());
	}

	@Test
	@DisplayName("Record 4901: County is Orange")
	void CountyOfRecord4901() {
		assertEquals("Orange", customers.get(4900).getCounty());
	}

	@Test
	@DisplayName("Record 4901: State is FL")
	void StateOfRecord4901() {
		assertEquals("FL", customers.get(4900).getState());
	}

	@Test
	@DisplayName("Record 4901: ZIP is 32803")
	void ZIPOfRecord4901() {
		assertEquals("32803", customers.get(4900).getZIP());
	}

	@Test
	@DisplayName("Record 4901: Phone is 407-894-1037")
	void PhoneOfRecord4901() {
		assertEquals("407-894-1037", customers.get(4900).getPhone());
	}

	@Test
	@DisplayName("Record 4901: Fax is 407-894-6711")
	void FaxOfRecord4901() {
		assertEquals("407-894-6711", customers.get(4900).getFax());
	}

	@Test
	@DisplayName("Record 4901: Email is tessa@chiquito.com")
	void EmailOfRecord4901() {
		assertEquals("tessa@chiquito.com", customers.get(4900).getEmail());
	}

	@Test
	@DisplayName("Record 4901: Web is http://www.tessachiquito.com")
	void WebOfRecord4901() {
		assertEquals("http://www.tessachiquito.com", customers.get(4900).getWeb());
	}
}
