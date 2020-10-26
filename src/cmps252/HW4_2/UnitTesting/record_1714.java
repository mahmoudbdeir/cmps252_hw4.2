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
class Record_1714 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1714: FirstName is Jerry")
	void FirstNameOfRecord1714() {
		assertEquals("Jerry", customers.get(1713).getFirstName());
	}

	@Test
	@DisplayName("Record 1714: LastName is Cancel")
	void LastNameOfRecord1714() {
		assertEquals("Cancel", customers.get(1713).getLastName());
	}

	@Test
	@DisplayName("Record 1714: Company is Watergate Hotel")
	void CompanyOfRecord1714() {
		assertEquals("Watergate Hotel", customers.get(1713).getCompany());
	}

	@Test
	@DisplayName("Record 1714: Address is 3740 Coronado Ave")
	void AddressOfRecord1714() {
		assertEquals("3740 Coronado Ave", customers.get(1713).getAddress());
	}

	@Test
	@DisplayName("Record 1714: City is Stockton")
	void CityOfRecord1714() {
		assertEquals("Stockton", customers.get(1713).getCity());
	}

	@Test
	@DisplayName("Record 1714: County is San Joaquin")
	void CountyOfRecord1714() {
		assertEquals("San Joaquin", customers.get(1713).getCounty());
	}

	@Test
	@DisplayName("Record 1714: State is CA")
	void StateOfRecord1714() {
		assertEquals("CA", customers.get(1713).getState());
	}

	@Test
	@DisplayName("Record 1714: ZIP is 95204")
	void ZIPOfRecord1714() {
		assertEquals("95204", customers.get(1713).getZIP());
	}

	@Test
	@DisplayName("Record 1714: Phone is 209-463-0236")
	void PhoneOfRecord1714() {
		assertEquals("209-463-0236", customers.get(1713).getPhone());
	}

	@Test
	@DisplayName("Record 1714: Fax is 209-463-1202")
	void FaxOfRecord1714() {
		assertEquals("209-463-1202", customers.get(1713).getFax());
	}

	@Test
	@DisplayName("Record 1714: Email is jerry@cancel.com")
	void EmailOfRecord1714() {
		assertEquals("jerry@cancel.com", customers.get(1713).getEmail());
	}

	@Test
	@DisplayName("Record 1714: Web is http://www.jerrycancel.com")
	void WebOfRecord1714() {
		assertEquals("http://www.jerrycancel.com", customers.get(1713).getWeb());
	}
}
