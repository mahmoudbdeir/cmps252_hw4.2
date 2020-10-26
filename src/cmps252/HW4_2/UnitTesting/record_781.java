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

@Tag("7")
class Record_781 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 781: FirstName is Corine")
	void FirstNameOfRecord781() {
		assertEquals("Corine", customers.get(780).getFirstName());
	}

	@Test
	@DisplayName("Record 781: LastName is Dettinger")
	void LastNameOfRecord781() {
		assertEquals("Dettinger", customers.get(780).getLastName());
	}

	@Test
	@DisplayName("Record 781: Company is J & B Classical Glass & Mir Co")
	void CompanyOfRecord781() {
		assertEquals("J & B Classical Glass & Mir Co", customers.get(780).getCompany());
	}

	@Test
	@DisplayName("Record 781: Address is 145 Pennington St")
	void AddressOfRecord781() {
		assertEquals("145 Pennington St", customers.get(780).getAddress());
	}

	@Test
	@DisplayName("Record 781: City is Newark")
	void CityOfRecord781() {
		assertEquals("Newark", customers.get(780).getCity());
	}

	@Test
	@DisplayName("Record 781: County is Essex")
	void CountyOfRecord781() {
		assertEquals("Essex", customers.get(780).getCounty());
	}

	@Test
	@DisplayName("Record 781: State is NJ")
	void StateOfRecord781() {
		assertEquals("NJ", customers.get(780).getState());
	}

	@Test
	@DisplayName("Record 781: ZIP is 7105")
	void ZIPOfRecord781() {
		assertEquals("7105", customers.get(780).getZIP());
	}

	@Test
	@DisplayName("Record 781: Phone is 973-589-4728")
	void PhoneOfRecord781() {
		assertEquals("973-589-4728", customers.get(780).getPhone());
	}

	@Test
	@DisplayName("Record 781: Fax is 973-589-7578")
	void FaxOfRecord781() {
		assertEquals("973-589-7578", customers.get(780).getFax());
	}

	@Test
	@DisplayName("Record 781: Email is corine@dettinger.com")
	void EmailOfRecord781() {
		assertEquals("corine@dettinger.com", customers.get(780).getEmail());
	}

	@Test
	@DisplayName("Record 781: Web is http://www.corinedettinger.com")
	void WebOfRecord781() {
		assertEquals("http://www.corinedettinger.com", customers.get(780).getWeb());
	}
}
