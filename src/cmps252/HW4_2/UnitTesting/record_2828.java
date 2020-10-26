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

@Tag("33")
class Record_2828 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2828: FirstName is Clara")
	void FirstNameOfRecord2828() {
		assertEquals("Clara", customers.get(2827).getFirstName());
	}

	@Test
	@DisplayName("Record 2828: LastName is Haynam")
	void LastNameOfRecord2828() {
		assertEquals("Haynam", customers.get(2827).getLastName());
	}

	@Test
	@DisplayName("Record 2828: Company is Snappy Signs")
	void CompanyOfRecord2828() {
		assertEquals("Snappy Signs", customers.get(2827).getCompany());
	}

	@Test
	@DisplayName("Record 2828: Address is 501 W Fireweed Ln")
	void AddressOfRecord2828() {
		assertEquals("501 W Fireweed Ln", customers.get(2827).getAddress());
	}

	@Test
	@DisplayName("Record 2828: City is Anchorage")
	void CityOfRecord2828() {
		assertEquals("Anchorage", customers.get(2827).getCity());
	}

	@Test
	@DisplayName("Record 2828: County is Anchorage")
	void CountyOfRecord2828() {
		assertEquals("Anchorage", customers.get(2827).getCounty());
	}

	@Test
	@DisplayName("Record 2828: State is AK")
	void StateOfRecord2828() {
		assertEquals("AK", customers.get(2827).getState());
	}

	@Test
	@DisplayName("Record 2828: ZIP is 99503")
	void ZIPOfRecord2828() {
		assertEquals("99503", customers.get(2827).getZIP());
	}

	@Test
	@DisplayName("Record 2828: Phone is 907-274-7700")
	void PhoneOfRecord2828() {
		assertEquals("907-274-7700", customers.get(2827).getPhone());
	}

	@Test
	@DisplayName("Record 2828: Fax is 907-274-5806")
	void FaxOfRecord2828() {
		assertEquals("907-274-5806", customers.get(2827).getFax());
	}

	@Test
	@DisplayName("Record 2828: Email is clara@haynam.com")
	void EmailOfRecord2828() {
		assertEquals("clara@haynam.com", customers.get(2827).getEmail());
	}

	@Test
	@DisplayName("Record 2828: Web is http://www.clarahaynam.com")
	void WebOfRecord2828() {
		assertEquals("http://www.clarahaynam.com", customers.get(2827).getWeb());
	}
}
