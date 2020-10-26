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
class Record_2294 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2294: FirstName is John")
	void FirstNameOfRecord2294() {
		assertEquals("John", customers.get(2293).getFirstName());
	}

	@Test
	@DisplayName("Record 2294: LastName is Quackenbush")
	void LastNameOfRecord2294() {
		assertEquals("Quackenbush", customers.get(2293).getLastName());
	}

	@Test
	@DisplayName("Record 2294: Company is Rockland Boat Inc")
	void CompanyOfRecord2294() {
		assertEquals("Rockland Boat Inc", customers.get(2293).getCompany());
	}

	@Test
	@DisplayName("Record 2294: Address is 1175 S Aspen Ave")
	void AddressOfRecord2294() {
		assertEquals("1175 S Aspen Ave", customers.get(2293).getAddress());
	}

	@Test
	@DisplayName("Record 2294: City is Broken Arrow")
	void CityOfRecord2294() {
		assertEquals("Broken Arrow", customers.get(2293).getCity());
	}

	@Test
	@DisplayName("Record 2294: County is Tulsa")
	void CountyOfRecord2294() {
		assertEquals("Tulsa", customers.get(2293).getCounty());
	}

	@Test
	@DisplayName("Record 2294: State is OK")
	void StateOfRecord2294() {
		assertEquals("OK", customers.get(2293).getState());
	}

	@Test
	@DisplayName("Record 2294: ZIP is 74012")
	void ZIPOfRecord2294() {
		assertEquals("74012", customers.get(2293).getZIP());
	}

	@Test
	@DisplayName("Record 2294: Phone is 918-251-7440")
	void PhoneOfRecord2294() {
		assertEquals("918-251-7440", customers.get(2293).getPhone());
	}

	@Test
	@DisplayName("Record 2294: Fax is 918-251-5762")
	void FaxOfRecord2294() {
		assertEquals("918-251-5762", customers.get(2293).getFax());
	}

	@Test
	@DisplayName("Record 2294: Email is john@quackenbush.com")
	void EmailOfRecord2294() {
		assertEquals("john@quackenbush.com", customers.get(2293).getEmail());
	}

	@Test
	@DisplayName("Record 2294: Web is http://www.johnquackenbush.com")
	void WebOfRecord2294() {
		assertEquals("http://www.johnquackenbush.com", customers.get(2293).getWeb());
	}
}
