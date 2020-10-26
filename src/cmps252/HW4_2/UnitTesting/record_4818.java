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

@Tag("32")
class Record_4818 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4818: FirstName is Michele")
	void FirstNameOfRecord4818() {
		assertEquals("Michele", customers.get(4817).getFirstName());
	}

	@Test
	@DisplayName("Record 4818: LastName is Imbesi")
	void LastNameOfRecord4818() {
		assertEquals("Imbesi", customers.get(4817).getLastName());
	}

	@Test
	@DisplayName("Record 4818: Company is Jones G Robert")
	void CompanyOfRecord4818() {
		assertEquals("Jones G Robert", customers.get(4817).getCompany());
	}

	@Test
	@DisplayName("Record 4818: Address is Box #-38069")
	void AddressOfRecord4818() {
		assertEquals("Box #-38069", customers.get(4817).getAddress());
	}

	@Test
	@DisplayName("Record 4818: City is Colorado Springs")
	void CityOfRecord4818() {
		assertEquals("Colorado Springs", customers.get(4817).getCity());
	}

	@Test
	@DisplayName("Record 4818: County is El Paso")
	void CountyOfRecord4818() {
		assertEquals("El Paso", customers.get(4817).getCounty());
	}

	@Test
	@DisplayName("Record 4818: State is CO")
	void StateOfRecord4818() {
		assertEquals("CO", customers.get(4817).getState());
	}

	@Test
	@DisplayName("Record 4818: ZIP is 80937")
	void ZIPOfRecord4818() {
		assertEquals("80937", customers.get(4817).getZIP());
	}

	@Test
	@DisplayName("Record 4818: Phone is 719-632-7286")
	void PhoneOfRecord4818() {
		assertEquals("719-632-7286", customers.get(4817).getPhone());
	}

	@Test
	@DisplayName("Record 4818: Fax is 719-632-0827")
	void FaxOfRecord4818() {
		assertEquals("719-632-0827", customers.get(4817).getFax());
	}

	@Test
	@DisplayName("Record 4818: Email is michele@imbesi.com")
	void EmailOfRecord4818() {
		assertEquals("michele@imbesi.com", customers.get(4817).getEmail());
	}

	@Test
	@DisplayName("Record 4818: Web is http://www.michelymbesi.com")
	void WebOfRecord4818() {
		assertEquals("http://www.michelymbesi.com", customers.get(4817).getWeb());
	}
}
