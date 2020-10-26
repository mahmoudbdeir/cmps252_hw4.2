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
class Record_2129 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2129: FirstName is Shellie")
	void FirstNameOfRecord2129() {
		assertEquals("Shellie", customers.get(2128).getFirstName());
	}

	@Test
	@DisplayName("Record 2129: LastName is Emerich")
	void LastNameOfRecord2129() {
		assertEquals("Emerich", customers.get(2128).getLastName());
	}

	@Test
	@DisplayName("Record 2129: Company is Dallas W Hartman Pc")
	void CompanyOfRecord2129() {
		assertEquals("Dallas W Hartman Pc", customers.get(2128).getCompany());
	}

	@Test
	@DisplayName("Record 2129: Address is 2500 W Lake St")
	void AddressOfRecord2129() {
		assertEquals("2500 W Lake St", customers.get(2128).getAddress());
	}

	@Test
	@DisplayName("Record 2129: City is Chicago")
	void CityOfRecord2129() {
		assertEquals("Chicago", customers.get(2128).getCity());
	}

	@Test
	@DisplayName("Record 2129: County is Cook")
	void CountyOfRecord2129() {
		assertEquals("Cook", customers.get(2128).getCounty());
	}

	@Test
	@DisplayName("Record 2129: State is IL")
	void StateOfRecord2129() {
		assertEquals("IL", customers.get(2128).getState());
	}

	@Test
	@DisplayName("Record 2129: ZIP is 60612")
	void ZIPOfRecord2129() {
		assertEquals("60612", customers.get(2128).getZIP());
	}

	@Test
	@DisplayName("Record 2129: Phone is 312-733-7087")
	void PhoneOfRecord2129() {
		assertEquals("312-733-7087", customers.get(2128).getPhone());
	}

	@Test
	@DisplayName("Record 2129: Fax is 312-733-7288")
	void FaxOfRecord2129() {
		assertEquals("312-733-7288", customers.get(2128).getFax());
	}

	@Test
	@DisplayName("Record 2129: Email is shellie@emerich.com")
	void EmailOfRecord2129() {
		assertEquals("shellie@emerich.com", customers.get(2128).getEmail());
	}

	@Test
	@DisplayName("Record 2129: Web is http://www.shellieemerich.com")
	void WebOfRecord2129() {
		assertEquals("http://www.shellieemerich.com", customers.get(2128).getWeb());
	}
}
