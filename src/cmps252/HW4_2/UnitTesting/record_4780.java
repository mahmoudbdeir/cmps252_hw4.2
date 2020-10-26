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
class Record_4780 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4780: FirstName is Colby")
	void FirstNameOfRecord4780() {
		assertEquals("Colby", customers.get(4779).getFirstName());
	}

	@Test
	@DisplayName("Record 4780: LastName is Fryar")
	void LastNameOfRecord4780() {
		assertEquals("Fryar", customers.get(4779).getLastName());
	}

	@Test
	@DisplayName("Record 4780: Company is Blencoe State Bank")
	void CompanyOfRecord4780() {
		assertEquals("Blencoe State Bank", customers.get(4779).getCompany());
	}

	@Test
	@DisplayName("Record 4780: Address is 155 N Winter St")
	void AddressOfRecord4780() {
		assertEquals("155 N Winter St", customers.get(4779).getAddress());
	}

	@Test
	@DisplayName("Record 4780: City is Adrian")
	void CityOfRecord4780() {
		assertEquals("Adrian", customers.get(4779).getCity());
	}

	@Test
	@DisplayName("Record 4780: County is Lenawee")
	void CountyOfRecord4780() {
		assertEquals("Lenawee", customers.get(4779).getCounty());
	}

	@Test
	@DisplayName("Record 4780: State is MI")
	void StateOfRecord4780() {
		assertEquals("MI", customers.get(4779).getState());
	}

	@Test
	@DisplayName("Record 4780: ZIP is 49221")
	void ZIPOfRecord4780() {
		assertEquals("49221", customers.get(4779).getZIP());
	}

	@Test
	@DisplayName("Record 4780: Phone is 517-263-2315")
	void PhoneOfRecord4780() {
		assertEquals("517-263-2315", customers.get(4779).getPhone());
	}

	@Test
	@DisplayName("Record 4780: Fax is 517-263-5806")
	void FaxOfRecord4780() {
		assertEquals("517-263-5806", customers.get(4779).getFax());
	}

	@Test
	@DisplayName("Record 4780: Email is colby@fryar.com")
	void EmailOfRecord4780() {
		assertEquals("colby@fryar.com", customers.get(4779).getEmail());
	}

	@Test
	@DisplayName("Record 4780: Web is http://www.colbyfryar.com")
	void WebOfRecord4780() {
		assertEquals("http://www.colbyfryar.com", customers.get(4779).getWeb());
	}
}
