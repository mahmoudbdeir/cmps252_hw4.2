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
class Record_202 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 202: FirstName is Bridgette")
	void FirstNameOfRecord202() {
		assertEquals("Bridgette", customers.get(201).getFirstName());
	}

	@Test
	@DisplayName("Record 202: LastName is Struchen")
	void LastNameOfRecord202() {
		assertEquals("Struchen", customers.get(201).getLastName());
	}

	@Test
	@DisplayName("Record 202: Company is Warren Nett & Associates Inc")
	void CompanyOfRecord202() {
		assertEquals("Warren Nett & Associates Inc", customers.get(201).getCompany());
	}

	@Test
	@DisplayName("Record 202: Address is 4821 Golden Ave")
	void AddressOfRecord202() {
		assertEquals("4821 Golden Ave", customers.get(201).getAddress());
	}

	@Test
	@DisplayName("Record 202: City is Riverside")
	void CityOfRecord202() {
		assertEquals("Riverside", customers.get(201).getCity());
	}

	@Test
	@DisplayName("Record 202: County is Riverside")
	void CountyOfRecord202() {
		assertEquals("Riverside", customers.get(201).getCounty());
	}

	@Test
	@DisplayName("Record 202: State is CA")
	void StateOfRecord202() {
		assertEquals("CA", customers.get(201).getState());
	}

	@Test
	@DisplayName("Record 202: ZIP is 92505")
	void ZIPOfRecord202() {
		assertEquals("92505", customers.get(201).getZIP());
	}

	@Test
	@DisplayName("Record 202: Phone is 951-352-7717")
	void PhoneOfRecord202() {
		assertEquals("951-352-7717", customers.get(201).getPhone());
	}

	@Test
	@DisplayName("Record 202: Fax is 951-352-2312")
	void FaxOfRecord202() {
		assertEquals("951-352-2312", customers.get(201).getFax());
	}

	@Test
	@DisplayName("Record 202: Email is bridgette@struchen.com")
	void EmailOfRecord202() {
		assertEquals("bridgette@struchen.com", customers.get(201).getEmail());
	}

	@Test
	@DisplayName("Record 202: Web is http://www.bridgettestruchen.com")
	void WebOfRecord202() {
		assertEquals("http://www.bridgettestruchen.com", customers.get(201).getWeb());
	}
}
