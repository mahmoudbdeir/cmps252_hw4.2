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

@Tag("4")
class Record_4792 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4792: FirstName is Alvin")
	void FirstNameOfRecord4792() {
		assertEquals("Alvin", customers.get(4791).getFirstName());
	}

	@Test
	@DisplayName("Record 4792: LastName is Derosset")
	void LastNameOfRecord4792() {
		assertEquals("Derosset", customers.get(4791).getLastName());
	}

	@Test
	@DisplayName("Record 4792: Company is Miles, Denise D")
	void CompanyOfRecord4792() {
		assertEquals("Miles, Denise D", customers.get(4791).getCompany());
	}

	@Test
	@DisplayName("Record 4792: Address is 1426 Pearl St  #-47")
	void AddressOfRecord4792() {
		assertEquals("1426 Pearl St  #-47", customers.get(4791).getAddress());
	}

	@Test
	@DisplayName("Record 4792: City is Boulder")
	void CityOfRecord4792() {
		assertEquals("Boulder", customers.get(4791).getCity());
	}

	@Test
	@DisplayName("Record 4792: County is Boulder")
	void CountyOfRecord4792() {
		assertEquals("Boulder", customers.get(4791).getCounty());
	}

	@Test
	@DisplayName("Record 4792: State is CO")
	void StateOfRecord4792() {
		assertEquals("CO", customers.get(4791).getState());
	}

	@Test
	@DisplayName("Record 4792: ZIP is 80302")
	void ZIPOfRecord4792() {
		assertEquals("80302", customers.get(4791).getZIP());
	}

	@Test
	@DisplayName("Record 4792: Phone is 303-938-7834")
	void PhoneOfRecord4792() {
		assertEquals("303-938-7834", customers.get(4791).getPhone());
	}

	@Test
	@DisplayName("Record 4792: Fax is 303-938-9591")
	void FaxOfRecord4792() {
		assertEquals("303-938-9591", customers.get(4791).getFax());
	}

	@Test
	@DisplayName("Record 4792: Email is alvin@derosset.com")
	void EmailOfRecord4792() {
		assertEquals("alvin@derosset.com", customers.get(4791).getEmail());
	}

	@Test
	@DisplayName("Record 4792: Web is http://www.alvinderosset.com")
	void WebOfRecord4792() {
		assertEquals("http://www.alvinderosset.com", customers.get(4791).getWeb());
	}
}
