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

@Tag("24")
class Record_2606 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2606: FirstName is Aldo")
	void FirstNameOfRecord2606() {
		assertEquals("Aldo", customers.get(2605).getFirstName());
	}

	@Test
	@DisplayName("Record 2606: LastName is Opielski")
	void LastNameOfRecord2606() {
		assertEquals("Opielski", customers.get(2605).getLastName());
	}

	@Test
	@DisplayName("Record 2606: Company is Kats, Alvin D")
	void CompanyOfRecord2606() {
		assertEquals("Kats, Alvin D", customers.get(2605).getCompany());
	}

	@Test
	@DisplayName("Record 2606: Address is 1970 Swarthmore Ave")
	void AddressOfRecord2606() {
		assertEquals("1970 Swarthmore Ave", customers.get(2605).getAddress());
	}

	@Test
	@DisplayName("Record 2606: City is Lakewood")
	void CityOfRecord2606() {
		assertEquals("Lakewood", customers.get(2605).getCity());
	}

	@Test
	@DisplayName("Record 2606: County is Ocean")
	void CountyOfRecord2606() {
		assertEquals("Ocean", customers.get(2605).getCounty());
	}

	@Test
	@DisplayName("Record 2606: State is NJ")
	void StateOfRecord2606() {
		assertEquals("NJ", customers.get(2605).getState());
	}

	@Test
	@DisplayName("Record 2606: ZIP is 08701")
	void ZIPOfRecord2606() {
		assertEquals("08701", customers.get(2605).getZIP());
	}

	@Test
	@DisplayName("Record 2606: Phone is 732-370-2198")
	void PhoneOfRecord2606() {
		assertEquals("732-370-2198", customers.get(2605).getPhone());
	}

	@Test
	@DisplayName("Record 2606: Fax is 732-370-3937")
	void FaxOfRecord2606() {
		assertEquals("732-370-3937", customers.get(2605).getFax());
	}

	@Test
	@DisplayName("Record 2606: Email is aldo@opielski.com")
	void EmailOfRecord2606() {
		assertEquals("aldo@opielski.com", customers.get(2605).getEmail());
	}

	@Test
	@DisplayName("Record 2606: Web is http://www.aldoopielski.com")
	void WebOfRecord2606() {
		assertEquals("http://www.aldoopielski.com", customers.get(2605).getWeb());
	}
}
