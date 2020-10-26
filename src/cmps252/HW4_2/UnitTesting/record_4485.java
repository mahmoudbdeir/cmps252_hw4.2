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
class Record_4485 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4485: FirstName is Dayna")
	void FirstNameOfRecord4485() {
		assertEquals("Dayna", customers.get(4484).getFirstName());
	}

	@Test
	@DisplayName("Record 4485: LastName is Wehrsig")
	void LastNameOfRecord4485() {
		assertEquals("Wehrsig", customers.get(4484).getLastName());
	}

	@Test
	@DisplayName("Record 4485: Company is A S B Industries")
	void CompanyOfRecord4485() {
		assertEquals("A S B Industries", customers.get(4484).getCompany());
	}

	@Test
	@DisplayName("Record 4485: Address is 3201 W Clark Rd")
	void AddressOfRecord4485() {
		assertEquals("3201 W Clark Rd", customers.get(4484).getAddress());
	}

	@Test
	@DisplayName("Record 4485: City is Champaign")
	void CityOfRecord4485() {
		assertEquals("Champaign", customers.get(4484).getCity());
	}

	@Test
	@DisplayName("Record 4485: County is Champaign")
	void CountyOfRecord4485() {
		assertEquals("Champaign", customers.get(4484).getCounty());
	}

	@Test
	@DisplayName("Record 4485: State is IL")
	void StateOfRecord4485() {
		assertEquals("IL", customers.get(4484).getState());
	}

	@Test
	@DisplayName("Record 4485: ZIP is 61821")
	void ZIPOfRecord4485() {
		assertEquals("61821", customers.get(4484).getZIP());
	}

	@Test
	@DisplayName("Record 4485: Phone is 217-356-6973")
	void PhoneOfRecord4485() {
		assertEquals("217-356-6973", customers.get(4484).getPhone());
	}

	@Test
	@DisplayName("Record 4485: Fax is 217-356-8466")
	void FaxOfRecord4485() {
		assertEquals("217-356-8466", customers.get(4484).getFax());
	}

	@Test
	@DisplayName("Record 4485: Email is dayna@wehrsig.com")
	void EmailOfRecord4485() {
		assertEquals("dayna@wehrsig.com", customers.get(4484).getEmail());
	}

	@Test
	@DisplayName("Record 4485: Web is http://www.daynawehrsig.com")
	void WebOfRecord4485() {
		assertEquals("http://www.daynawehrsig.com", customers.get(4484).getWeb());
	}
}
