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
class Record_2156 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2156: FirstName is Gustavo")
	void FirstNameOfRecord2156() {
		assertEquals("Gustavo", customers.get(2155).getFirstName());
	}

	@Test
	@DisplayName("Record 2156: LastName is Primas")
	void LastNameOfRecord2156() {
		assertEquals("Primas", customers.get(2155).getLastName());
	}

	@Test
	@DisplayName("Record 2156: Company is United Rent All")
	void CompanyOfRecord2156() {
		assertEquals("United Rent All", customers.get(2155).getCompany());
	}

	@Test
	@DisplayName("Record 2156: Address is 100 W Merchant St")
	void AddressOfRecord2156() {
		assertEquals("100 W Merchant St", customers.get(2155).getAddress());
	}

	@Test
	@DisplayName("Record 2156: City is Audubon")
	void CityOfRecord2156() {
		assertEquals("Audubon", customers.get(2155).getCity());
	}

	@Test
	@DisplayName("Record 2156: County is Camden")
	void CountyOfRecord2156() {
		assertEquals("Camden", customers.get(2155).getCounty());
	}

	@Test
	@DisplayName("Record 2156: State is NJ")
	void StateOfRecord2156() {
		assertEquals("NJ", customers.get(2155).getState());
	}

	@Test
	@DisplayName("Record 2156: ZIP is 08106")
	void ZIPOfRecord2156() {
		assertEquals("08106", customers.get(2155).getZIP());
	}

	@Test
	@DisplayName("Record 2156: Phone is 856-547-7837")
	void PhoneOfRecord2156() {
		assertEquals("856-547-7837", customers.get(2155).getPhone());
	}

	@Test
	@DisplayName("Record 2156: Fax is 856-547-1272")
	void FaxOfRecord2156() {
		assertEquals("856-547-1272", customers.get(2155).getFax());
	}

	@Test
	@DisplayName("Record 2156: Email is gustavo@primas.com")
	void EmailOfRecord2156() {
		assertEquals("gustavo@primas.com", customers.get(2155).getEmail());
	}

	@Test
	@DisplayName("Record 2156: Web is http://www.gustavoprimas.com")
	void WebOfRecord2156() {
		assertEquals("http://www.gustavoprimas.com", customers.get(2155).getWeb());
	}
}
