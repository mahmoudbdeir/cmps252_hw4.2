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

@Tag("38")
class Record_620 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 620: FirstName is Franklin")
	void FirstNameOfRecord620() {
		assertEquals("Franklin", customers.get(619).getFirstName());
	}

	@Test
	@DisplayName("Record 620: LastName is Cogill")
	void LastNameOfRecord620() {
		assertEquals("Cogill", customers.get(619).getLastName());
	}

	@Test
	@DisplayName("Record 620: Company is Mike Pirrone Produce")
	void CompanyOfRecord620() {
		assertEquals("Mike Pirrone Produce", customers.get(619).getCompany());
	}

	@Test
	@DisplayName("Record 620: Address is 4647 E Washington Blvd")
	void AddressOfRecord620() {
		assertEquals("4647 E Washington Blvd", customers.get(619).getAddress());
	}

	@Test
	@DisplayName("Record 620: City is Los Angeles")
	void CityOfRecord620() {
		assertEquals("Los Angeles", customers.get(619).getCity());
	}

	@Test
	@DisplayName("Record 620: County is Los Angeles")
	void CountyOfRecord620() {
		assertEquals("Los Angeles", customers.get(619).getCounty());
	}

	@Test
	@DisplayName("Record 620: State is CA")
	void StateOfRecord620() {
		assertEquals("CA", customers.get(619).getState());
	}

	@Test
	@DisplayName("Record 620: ZIP is 90040")
	void ZIPOfRecord620() {
		assertEquals("90040", customers.get(619).getZIP());
	}

	@Test
	@DisplayName("Record 620: Phone is 323-266-8865")
	void PhoneOfRecord620() {
		assertEquals("323-266-8865", customers.get(619).getPhone());
	}

	@Test
	@DisplayName("Record 620: Fax is 323-266-0238")
	void FaxOfRecord620() {
		assertEquals("323-266-0238", customers.get(619).getFax());
	}

	@Test
	@DisplayName("Record 620: Email is franklin@cogill.com")
	void EmailOfRecord620() {
		assertEquals("franklin@cogill.com", customers.get(619).getEmail());
	}

	@Test
	@DisplayName("Record 620: Web is http://www.franklincogill.com")
	void WebOfRecord620() {
		assertEquals("http://www.franklincogill.com", customers.get(619).getWeb());
	}
}
