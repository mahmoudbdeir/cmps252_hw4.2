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
class Record_4183 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4183: FirstName is Tony")
	void FirstNameOfRecord4183() {
		assertEquals("Tony", customers.get(4182).getFirstName());
	}

	@Test
	@DisplayName("Record 4183: LastName is Schouwyler")
	void LastNameOfRecord4183() {
		assertEquals("Schouwyler", customers.get(4182).getLastName());
	}

	@Test
	@DisplayName("Record 4183: Company is Pomper, Robert F Esq")
	void CompanyOfRecord4183() {
		assertEquals("Pomper, Robert F Esq", customers.get(4182).getCompany());
	}

	@Test
	@DisplayName("Record 4183: Address is 150 Court Ave")
	void AddressOfRecord4183() {
		assertEquals("150 Court Ave", customers.get(4182).getAddress());
	}

	@Test
	@DisplayName("Record 4183: City is Memphis")
	void CityOfRecord4183() {
		assertEquals("Memphis", customers.get(4182).getCity());
	}

	@Test
	@DisplayName("Record 4183: County is Shelby")
	void CountyOfRecord4183() {
		assertEquals("Shelby", customers.get(4182).getCounty());
	}

	@Test
	@DisplayName("Record 4183: State is TN")
	void StateOfRecord4183() {
		assertEquals("TN", customers.get(4182).getState());
	}

	@Test
	@DisplayName("Record 4183: ZIP is 38103")
	void ZIPOfRecord4183() {
		assertEquals("38103", customers.get(4182).getZIP());
	}

	@Test
	@DisplayName("Record 4183: Phone is 901-526-0214")
	void PhoneOfRecord4183() {
		assertEquals("901-526-0214", customers.get(4182).getPhone());
	}

	@Test
	@DisplayName("Record 4183: Fax is 901-526-0179")
	void FaxOfRecord4183() {
		assertEquals("901-526-0179", customers.get(4182).getFax());
	}

	@Test
	@DisplayName("Record 4183: Email is tony@schouwyler.com")
	void EmailOfRecord4183() {
		assertEquals("tony@schouwyler.com", customers.get(4182).getEmail());
	}

	@Test
	@DisplayName("Record 4183: Web is http://www.tonyschouwyler.com")
	void WebOfRecord4183() {
		assertEquals("http://www.tonyschouwyler.com", customers.get(4182).getWeb());
	}
}
