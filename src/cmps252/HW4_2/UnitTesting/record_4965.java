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

@Tag("34")
class Record_4965 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4965: FirstName is Patrica")
	void FirstNameOfRecord4965() {
		assertEquals("Patrica", customers.get(4964).getFirstName());
	}

	@Test
	@DisplayName("Record 4965: LastName is Wyer")
	void LastNameOfRecord4965() {
		assertEquals("Wyer", customers.get(4964).getLastName());
	}

	@Test
	@DisplayName("Record 4965: Company is Spillane & Spillane")
	void CompanyOfRecord4965() {
		assertEquals("Spillane & Spillane", customers.get(4964).getCompany());
	}

	@Test
	@DisplayName("Record 4965: Address is 9185 E Kenyon Ave  #-t280")
	void AddressOfRecord4965() {
		assertEquals("9185 E Kenyon Ave  #-t280", customers.get(4964).getAddress());
	}

	@Test
	@DisplayName("Record 4965: City is Denver")
	void CityOfRecord4965() {
		assertEquals("Denver", customers.get(4964).getCity());
	}

	@Test
	@DisplayName("Record 4965: County is Denver")
	void CountyOfRecord4965() {
		assertEquals("Denver", customers.get(4964).getCounty());
	}

	@Test
	@DisplayName("Record 4965: State is CO")
	void StateOfRecord4965() {
		assertEquals("CO", customers.get(4964).getState());
	}

	@Test
	@DisplayName("Record 4965: ZIP is 80237")
	void ZIPOfRecord4965() {
		assertEquals("80237", customers.get(4964).getZIP());
	}

	@Test
	@DisplayName("Record 4965: Phone is 303-773-1744")
	void PhoneOfRecord4965() {
		assertEquals("303-773-1744", customers.get(4964).getPhone());
	}

	@Test
	@DisplayName("Record 4965: Fax is 303-773-8698")
	void FaxOfRecord4965() {
		assertEquals("303-773-8698", customers.get(4964).getFax());
	}

	@Test
	@DisplayName("Record 4965: Email is patrica@wyer.com")
	void EmailOfRecord4965() {
		assertEquals("patrica@wyer.com", customers.get(4964).getEmail());
	}

	@Test
	@DisplayName("Record 4965: Web is http://www.patricawyer.com")
	void WebOfRecord4965() {
		assertEquals("http://www.patricawyer.com", customers.get(4964).getWeb());
	}
}
