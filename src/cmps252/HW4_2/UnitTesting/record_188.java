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

@Tag("6")
class Record_188 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 188: FirstName is Shayla")
	void FirstNameOfRecord188() {
		assertEquals("Shayla", customers.get(187).getFirstName());
	}

	@Test
	@DisplayName("Record 188: LastName is Montecalvo")
	void LastNameOfRecord188() {
		assertEquals("Montecalvo", customers.get(187).getLastName());
	}

	@Test
	@DisplayName("Record 188: Company is Commercial Printing Company")
	void CompanyOfRecord188() {
		assertEquals("Commercial Printing Company", customers.get(187).getCompany());
	}

	@Test
	@DisplayName("Record 188: Address is 701 W Clay Ave")
	void AddressOfRecord188() {
		assertEquals("701 W Clay Ave", customers.get(187).getAddress());
	}

	@Test
	@DisplayName("Record 188: City is Muskegon")
	void CityOfRecord188() {
		assertEquals("Muskegon", customers.get(187).getCity());
	}

	@Test
	@DisplayName("Record 188: County is Muskegon")
	void CountyOfRecord188() {
		assertEquals("Muskegon", customers.get(187).getCounty());
	}

	@Test
	@DisplayName("Record 188: State is MI")
	void StateOfRecord188() {
		assertEquals("MI", customers.get(187).getState());
	}

	@Test
	@DisplayName("Record 188: ZIP is 49440")
	void ZIPOfRecord188() {
		assertEquals("49440", customers.get(187).getZIP());
	}

	@Test
	@DisplayName("Record 188: Phone is 231-728-6198")
	void PhoneOfRecord188() {
		assertEquals("231-728-6198", customers.get(187).getPhone());
	}

	@Test
	@DisplayName("Record 188: Fax is 231-728-2982")
	void FaxOfRecord188() {
		assertEquals("231-728-2982", customers.get(187).getFax());
	}

	@Test
	@DisplayName("Record 188: Email is shayla@montecalvo.com")
	void EmailOfRecord188() {
		assertEquals("shayla@montecalvo.com", customers.get(187).getEmail());
	}

	@Test
	@DisplayName("Record 188: Web is http://www.shaylamontecalvo.com")
	void WebOfRecord188() {
		assertEquals("http://www.shaylamontecalvo.com", customers.get(187).getWeb());
	}
}
