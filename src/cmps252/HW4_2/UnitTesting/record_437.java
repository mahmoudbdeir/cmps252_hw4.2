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

@Tag("27")
class Record_437 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 437: FirstName is Geraldo")
	void FirstNameOfRecord437() {
		assertEquals("Geraldo", customers.get(436).getFirstName());
	}

	@Test
	@DisplayName("Record 437: LastName is Mccadden")
	void LastNameOfRecord437() {
		assertEquals("Mccadden", customers.get(436).getLastName());
	}

	@Test
	@DisplayName("Record 437: Company is Avon Glove Corp")
	void CompanyOfRecord437() {
		assertEquals("Avon Glove Corp", customers.get(436).getCompany());
	}

	@Test
	@DisplayName("Record 437: Address is 2309 Line Ave")
	void AddressOfRecord437() {
		assertEquals("2309 Line Ave", customers.get(436).getAddress());
	}

	@Test
	@DisplayName("Record 437: City is Amarillo")
	void CityOfRecord437() {
		assertEquals("Amarillo", customers.get(436).getCity());
	}

	@Test
	@DisplayName("Record 437: County is Potter")
	void CountyOfRecord437() {
		assertEquals("Potter", customers.get(436).getCounty());
	}

	@Test
	@DisplayName("Record 437: State is TX")
	void StateOfRecord437() {
		assertEquals("TX", customers.get(436).getState());
	}

	@Test
	@DisplayName("Record 437: ZIP is 79106")
	void ZIPOfRecord437() {
		assertEquals("79106", customers.get(436).getZIP());
	}

	@Test
	@DisplayName("Record 437: Phone is 806-374-5773")
	void PhoneOfRecord437() {
		assertEquals("806-374-5773", customers.get(436).getPhone());
	}

	@Test
	@DisplayName("Record 437: Fax is 806-374-9444")
	void FaxOfRecord437() {
		assertEquals("806-374-9444", customers.get(436).getFax());
	}

	@Test
	@DisplayName("Record 437: Email is geraldo@mccadden.com")
	void EmailOfRecord437() {
		assertEquals("geraldo@mccadden.com", customers.get(436).getEmail());
	}

	@Test
	@DisplayName("Record 437: Web is http://www.geraldomccadden.com")
	void WebOfRecord437() {
		assertEquals("http://www.geraldomccadden.com", customers.get(436).getWeb());
	}
}
