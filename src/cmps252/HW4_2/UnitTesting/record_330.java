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

@Tag("18")
class Record_330 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 330: FirstName is Olga")
	void FirstNameOfRecord330() {
		assertEquals("Olga", customers.get(329).getFirstName());
	}

	@Test
	@DisplayName("Record 330: LastName is Winland")
	void LastNameOfRecord330() {
		assertEquals("Winland", customers.get(329).getLastName());
	}

	@Test
	@DisplayName("Record 330: Company is Luts, John W Cpa")
	void CompanyOfRecord330() {
		assertEquals("Luts, John W Cpa", customers.get(329).getCompany());
	}

	@Test
	@DisplayName("Record 330: Address is 2610 Mabry Dr")
	void AddressOfRecord330() {
		assertEquals("2610 Mabry Dr", customers.get(329).getAddress());
	}

	@Test
	@DisplayName("Record 330: City is Clovis")
	void CityOfRecord330() {
		assertEquals("Clovis", customers.get(329).getCity());
	}

	@Test
	@DisplayName("Record 330: County is Curry")
	void CountyOfRecord330() {
		assertEquals("Curry", customers.get(329).getCounty());
	}

	@Test
	@DisplayName("Record 330: State is NM")
	void StateOfRecord330() {
		assertEquals("NM", customers.get(329).getState());
	}

	@Test
	@DisplayName("Record 330: ZIP is 88101")
	void ZIPOfRecord330() {
		assertEquals("88101", customers.get(329).getZIP());
	}

	@Test
	@DisplayName("Record 330: Phone is 505-763-2564")
	void PhoneOfRecord330() {
		assertEquals("505-763-2564", customers.get(329).getPhone());
	}

	@Test
	@DisplayName("Record 330: Fax is 505-763-2392")
	void FaxOfRecord330() {
		assertEquals("505-763-2392", customers.get(329).getFax());
	}

	@Test
	@DisplayName("Record 330: Email is olga@winland.com")
	void EmailOfRecord330() {
		assertEquals("olga@winland.com", customers.get(329).getEmail());
	}

	@Test
	@DisplayName("Record 330: Web is http://www.olgawinland.com")
	void WebOfRecord330() {
		assertEquals("http://www.olgawinland.com", customers.get(329).getWeb());
	}
}
