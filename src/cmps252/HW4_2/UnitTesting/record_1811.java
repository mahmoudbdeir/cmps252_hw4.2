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

@Tag("2")
class Record_1811 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1811: FirstName is Loyd")
	void FirstNameOfRecord1811() {
		assertEquals("Loyd", customers.get(1810).getFirstName());
	}

	@Test
	@DisplayName("Record 1811: LastName is Shackleton")
	void LastNameOfRecord1811() {
		assertEquals("Shackleton", customers.get(1810).getLastName());
	}

	@Test
	@DisplayName("Record 1811: Company is Kube, Michael R Esq")
	void CompanyOfRecord1811() {
		assertEquals("Kube, Michael R Esq", customers.get(1810).getCompany());
	}

	@Test
	@DisplayName("Record 1811: Address is 6622 Supply Row")
	void AddressOfRecord1811() {
		assertEquals("6622 Supply Row", customers.get(1810).getAddress());
	}

	@Test
	@DisplayName("Record 1811: City is Houston")
	void CityOfRecord1811() {
		assertEquals("Houston", customers.get(1810).getCity());
	}

	@Test
	@DisplayName("Record 1811: County is Harris")
	void CountyOfRecord1811() {
		assertEquals("Harris", customers.get(1810).getCounty());
	}

	@Test
	@DisplayName("Record 1811: State is TX")
	void StateOfRecord1811() {
		assertEquals("TX", customers.get(1810).getState());
	}

	@Test
	@DisplayName("Record 1811: ZIP is 77011")
	void ZIPOfRecord1811() {
		assertEquals("77011", customers.get(1810).getZIP());
	}

	@Test
	@DisplayName("Record 1811: Phone is 713-927-8197")
	void PhoneOfRecord1811() {
		assertEquals("713-927-8197", customers.get(1810).getPhone());
	}

	@Test
	@DisplayName("Record 1811: Fax is 713-927-8202")
	void FaxOfRecord1811() {
		assertEquals("713-927-8202", customers.get(1810).getFax());
	}

	@Test
	@DisplayName("Record 1811: Email is loyd@shackleton.com")
	void EmailOfRecord1811() {
		assertEquals("loyd@shackleton.com", customers.get(1810).getEmail());
	}

	@Test
	@DisplayName("Record 1811: Web is http://www.loydshackleton.com")
	void WebOfRecord1811() {
		assertEquals("http://www.loydshackleton.com", customers.get(1810).getWeb());
	}
}
