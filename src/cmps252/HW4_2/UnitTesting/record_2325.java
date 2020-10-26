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

@Tag("49")
class Record_2325 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2325: FirstName is Rico")
	void FirstNameOfRecord2325() {
		assertEquals("Rico", customers.get(2324).getFirstName());
	}

	@Test
	@DisplayName("Record 2325: LastName is Lear")
	void LastNameOfRecord2325() {
		assertEquals("Lear", customers.get(2324).getLastName());
	}

	@Test
	@DisplayName("Record 2325: Company is Miller, Kyth E Md")
	void CompanyOfRecord2325() {
		assertEquals("Miller, Kyth E Md", customers.get(2324).getCompany());
	}

	@Test
	@DisplayName("Record 2325: Address is 2040 Cottman Ave")
	void AddressOfRecord2325() {
		assertEquals("2040 Cottman Ave", customers.get(2324).getAddress());
	}

	@Test
	@DisplayName("Record 2325: City is Philadelphia")
	void CityOfRecord2325() {
		assertEquals("Philadelphia", customers.get(2324).getCity());
	}

	@Test
	@DisplayName("Record 2325: County is Philadelphia")
	void CountyOfRecord2325() {
		assertEquals("Philadelphia", customers.get(2324).getCounty());
	}

	@Test
	@DisplayName("Record 2325: State is PA")
	void StateOfRecord2325() {
		assertEquals("PA", customers.get(2324).getState());
	}

	@Test
	@DisplayName("Record 2325: ZIP is 19149")
	void ZIPOfRecord2325() {
		assertEquals("19149", customers.get(2324).getZIP());
	}

	@Test
	@DisplayName("Record 2325: Phone is 215-342-2274")
	void PhoneOfRecord2325() {
		assertEquals("215-342-2274", customers.get(2324).getPhone());
	}

	@Test
	@DisplayName("Record 2325: Fax is 215-342-7663")
	void FaxOfRecord2325() {
		assertEquals("215-342-7663", customers.get(2324).getFax());
	}

	@Test
	@DisplayName("Record 2325: Email is rico@lear.com")
	void EmailOfRecord2325() {
		assertEquals("rico@lear.com", customers.get(2324).getEmail());
	}

	@Test
	@DisplayName("Record 2325: Web is http://www.ricolear.com")
	void WebOfRecord2325() {
		assertEquals("http://www.ricolear.com", customers.get(2324).getWeb());
	}
}
