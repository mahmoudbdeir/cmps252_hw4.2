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

@Tag("19")
class Record_3541 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3541: FirstName is Robbin")
	void FirstNameOfRecord3541() {
		assertEquals("Robbin", customers.get(3540).getFirstName());
	}

	@Test
	@DisplayName("Record 3541: LastName is Kubal")
	void LastNameOfRecord3541() {
		assertEquals("Kubal", customers.get(3540).getLastName());
	}

	@Test
	@DisplayName("Record 3541: Company is Kates & Davis Attorneys At Law")
	void CompanyOfRecord3541() {
		assertEquals("Kates & Davis Attorneys At Law", customers.get(3540).getCompany());
	}

	@Test
	@DisplayName("Record 3541: Address is 423 N White Horse Pike")
	void AddressOfRecord3541() {
		assertEquals("423 N White Horse Pike", customers.get(3540).getAddress());
	}

	@Test
	@DisplayName("Record 3541: City is Hammonton")
	void CityOfRecord3541() {
		assertEquals("Hammonton", customers.get(3540).getCity());
	}

	@Test
	@DisplayName("Record 3541: County is Atlantic")
	void CountyOfRecord3541() {
		assertEquals("Atlantic", customers.get(3540).getCounty());
	}

	@Test
	@DisplayName("Record 3541: State is NJ")
	void StateOfRecord3541() {
		assertEquals("NJ", customers.get(3540).getState());
	}

	@Test
	@DisplayName("Record 3541: ZIP is 8037")
	void ZIPOfRecord3541() {
		assertEquals("8037", customers.get(3540).getZIP());
	}

	@Test
	@DisplayName("Record 3541: Phone is 609-561-9062")
	void PhoneOfRecord3541() {
		assertEquals("609-561-9062", customers.get(3540).getPhone());
	}

	@Test
	@DisplayName("Record 3541: Fax is 609-561-3439")
	void FaxOfRecord3541() {
		assertEquals("609-561-3439", customers.get(3540).getFax());
	}

	@Test
	@DisplayName("Record 3541: Email is robbin@kubal.com")
	void EmailOfRecord3541() {
		assertEquals("robbin@kubal.com", customers.get(3540).getEmail());
	}

	@Test
	@DisplayName("Record 3541: Web is http://www.robbinkubal.com")
	void WebOfRecord3541() {
		assertEquals("http://www.robbinkubal.com", customers.get(3540).getWeb());
	}
}
