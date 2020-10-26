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

@Tag("3")
class Record_559 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 559: FirstName is Clifford")
	void FirstNameOfRecord559() {
		assertEquals("Clifford", customers.get(558).getFirstName());
	}

	@Test
	@DisplayName("Record 559: LastName is Servan")
	void LastNameOfRecord559() {
		assertEquals("Servan", customers.get(558).getLastName());
	}

	@Test
	@DisplayName("Record 559: Company is Post, William G Jr")
	void CompanyOfRecord559() {
		assertEquals("Post, William G Jr", customers.get(558).getCompany());
	}

	@Test
	@DisplayName("Record 559: Address is 2131 Old Us Highway 51")
	void AddressOfRecord559() {
		assertEquals("2131 Old Us Highway 51", customers.get(558).getAddress());
	}

	@Test
	@DisplayName("Record 559: City is Makanda")
	void CityOfRecord559() {
		assertEquals("Makanda", customers.get(558).getCity());
	}

	@Test
	@DisplayName("Record 559: County is Jackson")
	void CountyOfRecord559() {
		assertEquals("Jackson", customers.get(558).getCounty());
	}

	@Test
	@DisplayName("Record 559: State is IL")
	void StateOfRecord559() {
		assertEquals("IL", customers.get(558).getState());
	}

	@Test
	@DisplayName("Record 559: ZIP is 62958")
	void ZIPOfRecord559() {
		assertEquals("62958", customers.get(558).getZIP());
	}

	@Test
	@DisplayName("Record 559: Phone is 618-457-4471")
	void PhoneOfRecord559() {
		assertEquals("618-457-4471", customers.get(558).getPhone());
	}

	@Test
	@DisplayName("Record 559: Fax is 618-457-9056")
	void FaxOfRecord559() {
		assertEquals("618-457-9056", customers.get(558).getFax());
	}

	@Test
	@DisplayName("Record 559: Email is clifford@servan.com")
	void EmailOfRecord559() {
		assertEquals("clifford@servan.com", customers.get(558).getEmail());
	}

	@Test
	@DisplayName("Record 559: Web is http://www.cliffordservan.com")
	void WebOfRecord559() {
		assertEquals("http://www.cliffordservan.com", customers.get(558).getWeb());
	}
}
