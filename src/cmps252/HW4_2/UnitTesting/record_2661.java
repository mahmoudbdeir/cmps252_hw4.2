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

@Tag("16")
class Record_2661 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2661: FirstName is Sara")
	void FirstNameOfRecord2661() {
		assertEquals("Sara", customers.get(2660).getFirstName());
	}

	@Test
	@DisplayName("Record 2661: LastName is Eckloff")
	void LastNameOfRecord2661() {
		assertEquals("Eckloff", customers.get(2660).getLastName());
	}

	@Test
	@DisplayName("Record 2661: Company is Simpson Paper Co")
	void CompanyOfRecord2661() {
		assertEquals("Simpson Paper Co", customers.get(2660).getCompany());
	}

	@Test
	@DisplayName("Record 2661: Address is 2001 Union Blvd")
	void AddressOfRecord2661() {
		assertEquals("2001 Union Blvd", customers.get(2660).getAddress());
	}

	@Test
	@DisplayName("Record 2661: City is Allentown")
	void CityOfRecord2661() {
		assertEquals("Allentown", customers.get(2660).getCity());
	}

	@Test
	@DisplayName("Record 2661: County is Lehigh")
	void CountyOfRecord2661() {
		assertEquals("Lehigh", customers.get(2660).getCounty());
	}

	@Test
	@DisplayName("Record 2661: State is PA")
	void StateOfRecord2661() {
		assertEquals("PA", customers.get(2660).getState());
	}

	@Test
	@DisplayName("Record 2661: ZIP is 18103")
	void ZIPOfRecord2661() {
		assertEquals("18103", customers.get(2660).getZIP());
	}

	@Test
	@DisplayName("Record 2661: Phone is 610-434-9871")
	void PhoneOfRecord2661() {
		assertEquals("610-434-9871", customers.get(2660).getPhone());
	}

	@Test
	@DisplayName("Record 2661: Fax is 610-434-9844")
	void FaxOfRecord2661() {
		assertEquals("610-434-9844", customers.get(2660).getFax());
	}

	@Test
	@DisplayName("Record 2661: Email is sara@eckloff.com")
	void EmailOfRecord2661() {
		assertEquals("sara@eckloff.com", customers.get(2660).getEmail());
	}

	@Test
	@DisplayName("Record 2661: Web is http://www.saraeckloff.com")
	void WebOfRecord2661() {
		assertEquals("http://www.saraeckloff.com", customers.get(2660).getWeb());
	}
}
