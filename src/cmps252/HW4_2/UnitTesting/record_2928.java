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

@Tag("28")
class Record_2928 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2928: FirstName is Modesto")
	void FirstNameOfRecord2928() {
		assertEquals("Modesto", customers.get(2927).getFirstName());
	}

	@Test
	@DisplayName("Record 2928: LastName is Heckathorne")
	void LastNameOfRecord2928() {
		assertEquals("Heckathorne", customers.get(2927).getLastName());
	}

	@Test
	@DisplayName("Record 2928: Company is Government Executive Magazine")
	void CompanyOfRecord2928() {
		assertEquals("Government Executive Magazine", customers.get(2927).getCompany());
	}

	@Test
	@DisplayName("Record 2928: Address is 8328 Beach Blvd")
	void AddressOfRecord2928() {
		assertEquals("8328 Beach Blvd", customers.get(2927).getAddress());
	}

	@Test
	@DisplayName("Record 2928: City is Jacksonville")
	void CityOfRecord2928() {
		assertEquals("Jacksonville", customers.get(2927).getCity());
	}

	@Test
	@DisplayName("Record 2928: County is Duval")
	void CountyOfRecord2928() {
		assertEquals("Duval", customers.get(2927).getCounty());
	}

	@Test
	@DisplayName("Record 2928: State is FL")
	void StateOfRecord2928() {
		assertEquals("FL", customers.get(2927).getState());
	}

	@Test
	@DisplayName("Record 2928: ZIP is 32216")
	void ZIPOfRecord2928() {
		assertEquals("32216", customers.get(2927).getZIP());
	}

	@Test
	@DisplayName("Record 2928: Phone is 904-724-8789")
	void PhoneOfRecord2928() {
		assertEquals("904-724-8789", customers.get(2927).getPhone());
	}

	@Test
	@DisplayName("Record 2928: Fax is 904-724-7932")
	void FaxOfRecord2928() {
		assertEquals("904-724-7932", customers.get(2927).getFax());
	}

	@Test
	@DisplayName("Record 2928: Email is modesto@heckathorne.com")
	void EmailOfRecord2928() {
		assertEquals("modesto@heckathorne.com", customers.get(2927).getEmail());
	}

	@Test
	@DisplayName("Record 2928: Web is http://www.modestoheckathorne.com")
	void WebOfRecord2928() {
		assertEquals("http://www.modestoheckathorne.com", customers.get(2927).getWeb());
	}
}
