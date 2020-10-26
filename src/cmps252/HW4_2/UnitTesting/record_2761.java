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

@Tag("44")
class Record_2761 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2761: FirstName is Elizabeth")
	void FirstNameOfRecord2761() {
		assertEquals("Elizabeth", customers.get(2760).getFirstName());
	}

	@Test
	@DisplayName("Record 2761: LastName is Goodsell")
	void LastNameOfRecord2761() {
		assertEquals("Goodsell", customers.get(2760).getLastName());
	}

	@Test
	@DisplayName("Record 2761: Company is J B Call & Company")
	void CompanyOfRecord2761() {
		assertEquals("J B Call & Company", customers.get(2760).getCompany());
	}

	@Test
	@DisplayName("Record 2761: Address is 40935 County Center Dr")
	void AddressOfRecord2761() {
		assertEquals("40935 County Center Dr", customers.get(2760).getAddress());
	}

	@Test
	@DisplayName("Record 2761: City is Temecula")
	void CityOfRecord2761() {
		assertEquals("Temecula", customers.get(2760).getCity());
	}

	@Test
	@DisplayName("Record 2761: County is Riverside")
	void CountyOfRecord2761() {
		assertEquals("Riverside", customers.get(2760).getCounty());
	}

	@Test
	@DisplayName("Record 2761: State is CA")
	void StateOfRecord2761() {
		assertEquals("CA", customers.get(2760).getState());
	}

	@Test
	@DisplayName("Record 2761: ZIP is 92591")
	void ZIPOfRecord2761() {
		assertEquals("92591", customers.get(2760).getZIP());
	}

	@Test
	@DisplayName("Record 2761: Phone is 951-699-0054")
	void PhoneOfRecord2761() {
		assertEquals("951-699-0054", customers.get(2760).getPhone());
	}

	@Test
	@DisplayName("Record 2761: Fax is 951-699-2113")
	void FaxOfRecord2761() {
		assertEquals("951-699-2113", customers.get(2760).getFax());
	}

	@Test
	@DisplayName("Record 2761: Email is elizabeth@goodsell.com")
	void EmailOfRecord2761() {
		assertEquals("elizabeth@goodsell.com", customers.get(2760).getEmail());
	}

	@Test
	@DisplayName("Record 2761: Web is http://www.elizabethgoodsell.com")
	void WebOfRecord2761() {
		assertEquals("http://www.elizabethgoodsell.com", customers.get(2760).getWeb());
	}
}
