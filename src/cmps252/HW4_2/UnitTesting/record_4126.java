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

@Tag("20")
class Record_4126 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4126: FirstName is Marion")
	void FirstNameOfRecord4126() {
		assertEquals("Marion", customers.get(4125).getFirstName());
	}

	@Test
	@DisplayName("Record 4126: LastName is Nigh")
	void LastNameOfRecord4126() {
		assertEquals("Nigh", customers.get(4125).getLastName());
	}

	@Test
	@DisplayName("Record 4126: Company is Earth Tech")
	void CompanyOfRecord4126() {
		assertEquals("Earth Tech", customers.get(4125).getCompany());
	}

	@Test
	@DisplayName("Record 4126: Address is 1040 N Woodward Ave")
	void AddressOfRecord4126() {
		assertEquals("1040 N Woodward Ave", customers.get(4125).getAddress());
	}

	@Test
	@DisplayName("Record 4126: City is Royal Oak")
	void CityOfRecord4126() {
		assertEquals("Royal Oak", customers.get(4125).getCity());
	}

	@Test
	@DisplayName("Record 4126: County is Oakland")
	void CountyOfRecord4126() {
		assertEquals("Oakland", customers.get(4125).getCounty());
	}

	@Test
	@DisplayName("Record 4126: State is MI")
	void StateOfRecord4126() {
		assertEquals("MI", customers.get(4125).getState());
	}

	@Test
	@DisplayName("Record 4126: ZIP is 48067")
	void ZIPOfRecord4126() {
		assertEquals("48067", customers.get(4125).getZIP());
	}

	@Test
	@DisplayName("Record 4126: Phone is 248-398-0469")
	void PhoneOfRecord4126() {
		assertEquals("248-398-0469", customers.get(4125).getPhone());
	}

	@Test
	@DisplayName("Record 4126: Fax is 248-398-9482")
	void FaxOfRecord4126() {
		assertEquals("248-398-9482", customers.get(4125).getFax());
	}

	@Test
	@DisplayName("Record 4126: Email is marion@nigh.com")
	void EmailOfRecord4126() {
		assertEquals("marion@nigh.com", customers.get(4125).getEmail());
	}

	@Test
	@DisplayName("Record 4126: Web is http://www.marionnigh.com")
	void WebOfRecord4126() {
		assertEquals("http://www.marionnigh.com", customers.get(4125).getWeb());
	}
}
