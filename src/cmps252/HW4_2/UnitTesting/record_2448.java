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

@Tag("29")
class Record_2448 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2448: FirstName is Joy")
	void FirstNameOfRecord2448() {
		assertEquals("Joy", customers.get(2447).getFirstName());
	}

	@Test
	@DisplayName("Record 2448: LastName is Kiffer")
	void LastNameOfRecord2448() {
		assertEquals("Kiffer", customers.get(2447).getLastName());
	}

	@Test
	@DisplayName("Record 2448: Company is Express Printing & Graphics")
	void CompanyOfRecord2448() {
		assertEquals("Express Printing & Graphics", customers.get(2447).getCompany());
	}

	@Test
	@DisplayName("Record 2448: Address is 474 Wilson Ave")
	void AddressOfRecord2448() {
		assertEquals("474 Wilson Ave", customers.get(2447).getAddress());
	}

	@Test
	@DisplayName("Record 2448: City is Newark")
	void CityOfRecord2448() {
		assertEquals("Newark", customers.get(2447).getCity());
	}

	@Test
	@DisplayName("Record 2448: County is Essex")
	void CountyOfRecord2448() {
		assertEquals("Essex", customers.get(2447).getCounty());
	}

	@Test
	@DisplayName("Record 2448: State is NJ")
	void StateOfRecord2448() {
		assertEquals("NJ", customers.get(2447).getState());
	}

	@Test
	@DisplayName("Record 2448: ZIP is 7105")
	void ZIPOfRecord2448() {
		assertEquals("7105", customers.get(2447).getZIP());
	}

	@Test
	@DisplayName("Record 2448: Phone is 973-465-3608")
	void PhoneOfRecord2448() {
		assertEquals("973-465-3608", customers.get(2447).getPhone());
	}

	@Test
	@DisplayName("Record 2448: Fax is 973-465-1448")
	void FaxOfRecord2448() {
		assertEquals("973-465-1448", customers.get(2447).getFax());
	}

	@Test
	@DisplayName("Record 2448: Email is joy@kiffer.com")
	void EmailOfRecord2448() {
		assertEquals("joy@kiffer.com", customers.get(2447).getEmail());
	}

	@Test
	@DisplayName("Record 2448: Web is http://www.joykiffer.com")
	void WebOfRecord2448() {
		assertEquals("http://www.joykiffer.com", customers.get(2447).getWeb());
	}
}
