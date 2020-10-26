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

@Tag("25")
class Record_343 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 343: FirstName is Dick")
	void FirstNameOfRecord343() {
		assertEquals("Dick", customers.get(342).getFirstName());
	}

	@Test
	@DisplayName("Record 343: LastName is Grimaldo")
	void LastNameOfRecord343() {
		assertEquals("Grimaldo", customers.get(342).getLastName());
	}

	@Test
	@DisplayName("Record 343: Company is Melots, Shawn A")
	void CompanyOfRecord343() {
		assertEquals("Melots, Shawn A", customers.get(342).getCompany());
	}

	@Test
	@DisplayName("Record 343: Address is 2600 Mabry Dr")
	void AddressOfRecord343() {
		assertEquals("2600 Mabry Dr", customers.get(342).getAddress());
	}

	@Test
	@DisplayName("Record 343: City is Clovis")
	void CityOfRecord343() {
		assertEquals("Clovis", customers.get(342).getCity());
	}

	@Test
	@DisplayName("Record 343: County is Curry")
	void CountyOfRecord343() {
		assertEquals("Curry", customers.get(342).getCounty());
	}

	@Test
	@DisplayName("Record 343: State is NM")
	void StateOfRecord343() {
		assertEquals("NM", customers.get(342).getState());
	}

	@Test
	@DisplayName("Record 343: ZIP is 88101")
	void ZIPOfRecord343() {
		assertEquals("88101", customers.get(342).getZIP());
	}

	@Test
	@DisplayName("Record 343: Phone is 505-763-7162")
	void PhoneOfRecord343() {
		assertEquals("505-763-7162", customers.get(342).getPhone());
	}

	@Test
	@DisplayName("Record 343: Fax is 505-763-2047")
	void FaxOfRecord343() {
		assertEquals("505-763-2047", customers.get(342).getFax());
	}

	@Test
	@DisplayName("Record 343: Email is dick@grimaldo.com")
	void EmailOfRecord343() {
		assertEquals("dick@grimaldo.com", customers.get(342).getEmail());
	}

	@Test
	@DisplayName("Record 343: Web is http://www.dickgrimaldo.com")
	void WebOfRecord343() {
		assertEquals("http://www.dickgrimaldo.com", customers.get(342).getWeb());
	}
}
