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

@Tag("3")
class Record_2693 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2693: FirstName is Julian")
	void FirstNameOfRecord2693() {
		assertEquals("Julian", customers.get(2692).getFirstName());
	}

	@Test
	@DisplayName("Record 2693: LastName is Miravalle")
	void LastNameOfRecord2693() {
		assertEquals("Miravalle", customers.get(2692).getLastName());
	}

	@Test
	@DisplayName("Record 2693: Company is Holiday Inn Bloomfield Hills")
	void CompanyOfRecord2693() {
		assertEquals("Holiday Inn Bloomfield Hills", customers.get(2692).getCompany());
	}

	@Test
	@DisplayName("Record 2693: Address is 3124 Leon Rd")
	void AddressOfRecord2693() {
		assertEquals("3124 Leon Rd", customers.get(2692).getAddress());
	}

	@Test
	@DisplayName("Record 2693: City is Jacksonville")
	void CityOfRecord2693() {
		assertEquals("Jacksonville", customers.get(2692).getCity());
	}

	@Test
	@DisplayName("Record 2693: County is Duval")
	void CountyOfRecord2693() {
		assertEquals("Duval", customers.get(2692).getCounty());
	}

	@Test
	@DisplayName("Record 2693: State is FL")
	void StateOfRecord2693() {
		assertEquals("FL", customers.get(2692).getState());
	}

	@Test
	@DisplayName("Record 2693: ZIP is 32246")
	void ZIPOfRecord2693() {
		assertEquals("32246", customers.get(2692).getZIP());
	}

	@Test
	@DisplayName("Record 2693: Phone is 904-646-3170")
	void PhoneOfRecord2693() {
		assertEquals("904-646-3170", customers.get(2692).getPhone());
	}

	@Test
	@DisplayName("Record 2693: Fax is 904-646-2563")
	void FaxOfRecord2693() {
		assertEquals("904-646-2563", customers.get(2692).getFax());
	}

	@Test
	@DisplayName("Record 2693: Email is julian@miravalle.com")
	void EmailOfRecord2693() {
		assertEquals("julian@miravalle.com", customers.get(2692).getEmail());
	}

	@Test
	@DisplayName("Record 2693: Web is http://www.julianmiravalle.com")
	void WebOfRecord2693() {
		assertEquals("http://www.julianmiravalle.com", customers.get(2692).getWeb());
	}
}
