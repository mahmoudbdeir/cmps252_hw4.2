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

@Tag("37")
class Record_3749 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3749: FirstName is Alana")
	void FirstNameOfRecord3749() {
		assertEquals("Alana", customers.get(3748).getFirstName());
	}

	@Test
	@DisplayName("Record 3749: LastName is Christello")
	void LastNameOfRecord3749() {
		assertEquals("Christello", customers.get(3748).getLastName());
	}

	@Test
	@DisplayName("Record 3749: Company is Panache")
	void CompanyOfRecord3749() {
		assertEquals("Panache", customers.get(3748).getCompany());
	}

	@Test
	@DisplayName("Record 3749: Address is 499 Salmar Ave  #-f")
	void AddressOfRecord3749() {
		assertEquals("499 Salmar Ave  #-f", customers.get(3748).getAddress());
	}

	@Test
	@DisplayName("Record 3749: City is Campbell")
	void CityOfRecord3749() {
		assertEquals("Campbell", customers.get(3748).getCity());
	}

	@Test
	@DisplayName("Record 3749: County is Santa Clara")
	void CountyOfRecord3749() {
		assertEquals("Santa Clara", customers.get(3748).getCounty());
	}

	@Test
	@DisplayName("Record 3749: State is CA")
	void StateOfRecord3749() {
		assertEquals("CA", customers.get(3748).getState());
	}

	@Test
	@DisplayName("Record 3749: ZIP is 95008")
	void ZIPOfRecord3749() {
		assertEquals("95008", customers.get(3748).getZIP());
	}

	@Test
	@DisplayName("Record 3749: Phone is 408-378-7407")
	void PhoneOfRecord3749() {
		assertEquals("408-378-7407", customers.get(3748).getPhone());
	}

	@Test
	@DisplayName("Record 3749: Fax is 408-378-3241")
	void FaxOfRecord3749() {
		assertEquals("408-378-3241", customers.get(3748).getFax());
	}

	@Test
	@DisplayName("Record 3749: Email is alana@christello.com")
	void EmailOfRecord3749() {
		assertEquals("alana@christello.com", customers.get(3748).getEmail());
	}

	@Test
	@DisplayName("Record 3749: Web is http://www.alanachristello.com")
	void WebOfRecord3749() {
		assertEquals("http://www.alanachristello.com", customers.get(3748).getWeb());
	}
}
