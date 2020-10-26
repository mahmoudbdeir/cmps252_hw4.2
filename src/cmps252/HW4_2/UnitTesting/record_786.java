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
class Record_786 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 786: FirstName is Nora")
	void FirstNameOfRecord786() {
		assertEquals("Nora", customers.get(785).getFirstName());
	}

	@Test
	@DisplayName("Record 786: LastName is Truesdell")
	void LastNameOfRecord786() {
		assertEquals("Truesdell", customers.get(785).getLastName());
	}

	@Test
	@DisplayName("Record 786: Company is M D Hardy Inc")
	void CompanyOfRecord786() {
		assertEquals("M D Hardy Inc", customers.get(785).getCompany());
	}

	@Test
	@DisplayName("Record 786: Address is 2901 Hedley St")
	void AddressOfRecord786() {
		assertEquals("2901 Hedley St", customers.get(785).getAddress());
	}

	@Test
	@DisplayName("Record 786: City is Philadelphia")
	void CityOfRecord786() {
		assertEquals("Philadelphia", customers.get(785).getCity());
	}

	@Test
	@DisplayName("Record 786: County is Philadelphia")
	void CountyOfRecord786() {
		assertEquals("Philadelphia", customers.get(785).getCounty());
	}

	@Test
	@DisplayName("Record 786: State is PA")
	void StateOfRecord786() {
		assertEquals("PA", customers.get(785).getState());
	}

	@Test
	@DisplayName("Record 786: ZIP is 19137")
	void ZIPOfRecord786() {
		assertEquals("19137", customers.get(785).getZIP());
	}

	@Test
	@DisplayName("Record 786: Phone is 215-535-9325")
	void PhoneOfRecord786() {
		assertEquals("215-535-9325", customers.get(785).getPhone());
	}

	@Test
	@DisplayName("Record 786: Fax is 215-535-6211")
	void FaxOfRecord786() {
		assertEquals("215-535-6211", customers.get(785).getFax());
	}

	@Test
	@DisplayName("Record 786: Email is nora@truesdell.com")
	void EmailOfRecord786() {
		assertEquals("nora@truesdell.com", customers.get(785).getEmail());
	}

	@Test
	@DisplayName("Record 786: Web is http://www.noratruesdell.com")
	void WebOfRecord786() {
		assertEquals("http://www.noratruesdell.com", customers.get(785).getWeb());
	}
}
