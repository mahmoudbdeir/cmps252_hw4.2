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
class Record_1376 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1376: FirstName is Kenton")
	void FirstNameOfRecord1376() {
		assertEquals("Kenton", customers.get(1375).getFirstName());
	}

	@Test
	@DisplayName("Record 1376: LastName is Toliver")
	void LastNameOfRecord1376() {
		assertEquals("Toliver", customers.get(1375).getLastName());
	}

	@Test
	@DisplayName("Record 1376: Company is Watertown Physical Thrpy Assoc")
	void CompanyOfRecord1376() {
		assertEquals("Watertown Physical Thrpy Assoc", customers.get(1375).getCompany());
	}

	@Test
	@DisplayName("Record 1376: Address is 112 Sidney St")
	void AddressOfRecord1376() {
		assertEquals("112 Sidney St", customers.get(1375).getAddress());
	}

	@Test
	@DisplayName("Record 1376: City is Saint Louis")
	void CityOfRecord1376() {
		assertEquals("Saint Louis", customers.get(1375).getCity());
	}

	@Test
	@DisplayName("Record 1376: County is Saint Louis City")
	void CountyOfRecord1376() {
		assertEquals("Saint Louis City", customers.get(1375).getCounty());
	}

	@Test
	@DisplayName("Record 1376: State is MO")
	void StateOfRecord1376() {
		assertEquals("MO", customers.get(1375).getState());
	}

	@Test
	@DisplayName("Record 1376: ZIP is 63104")
	void ZIPOfRecord1376() {
		assertEquals("63104", customers.get(1375).getZIP());
	}

	@Test
	@DisplayName("Record 1376: Phone is 314-773-6814")
	void PhoneOfRecord1376() {
		assertEquals("314-773-6814", customers.get(1375).getPhone());
	}

	@Test
	@DisplayName("Record 1376: Fax is 314-773-7502")
	void FaxOfRecord1376() {
		assertEquals("314-773-7502", customers.get(1375).getFax());
	}

	@Test
	@DisplayName("Record 1376: Email is kenton@toliver.com")
	void EmailOfRecord1376() {
		assertEquals("kenton@toliver.com", customers.get(1375).getEmail());
	}

	@Test
	@DisplayName("Record 1376: Web is http://www.kentontoliver.com")
	void WebOfRecord1376() {
		assertEquals("http://www.kentontoliver.com", customers.get(1375).getWeb());
	}
}
