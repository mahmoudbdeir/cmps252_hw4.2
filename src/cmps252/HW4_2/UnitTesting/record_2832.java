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

@Tag("0")
class Record_2832 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2832: FirstName is Donny")
	void FirstNameOfRecord2832() {
		assertEquals("Donny", customers.get(2831).getFirstName());
	}

	@Test
	@DisplayName("Record 2832: LastName is Mckenney")
	void LastNameOfRecord2832() {
		assertEquals("Mckenney", customers.get(2831).getLastName());
	}

	@Test
	@DisplayName("Record 2832: Company is Distinctive Tool & Die")
	void CompanyOfRecord2832() {
		assertEquals("Distinctive Tool & Die", customers.get(2831).getCompany());
	}

	@Test
	@DisplayName("Record 2832: Address is 491 S Willow St  #-104")
	void AddressOfRecord2832() {
		assertEquals("491 S Willow St  #-104", customers.get(2831).getAddress());
	}

	@Test
	@DisplayName("Record 2832: City is Wasilla")
	void CityOfRecord2832() {
		assertEquals("Wasilla", customers.get(2831).getCity());
	}

	@Test
	@DisplayName("Record 2832: County is Matanuska Susitna")
	void CountyOfRecord2832() {
		assertEquals("Matanuska Susitna", customers.get(2831).getCounty());
	}

	@Test
	@DisplayName("Record 2832: State is AK")
	void StateOfRecord2832() {
		assertEquals("AK", customers.get(2831).getState());
	}

	@Test
	@DisplayName("Record 2832: ZIP is 99654")
	void ZIPOfRecord2832() {
		assertEquals("99654", customers.get(2831).getZIP());
	}

	@Test
	@DisplayName("Record 2832: Phone is 907-373-5304")
	void PhoneOfRecord2832() {
		assertEquals("907-373-5304", customers.get(2831).getPhone());
	}

	@Test
	@DisplayName("Record 2832: Fax is 907-373-1217")
	void FaxOfRecord2832() {
		assertEquals("907-373-1217", customers.get(2831).getFax());
	}

	@Test
	@DisplayName("Record 2832: Email is donny@mckenney.com")
	void EmailOfRecord2832() {
		assertEquals("donny@mckenney.com", customers.get(2831).getEmail());
	}

	@Test
	@DisplayName("Record 2832: Web is http://www.donnymckenney.com")
	void WebOfRecord2832() {
		assertEquals("http://www.donnymckenney.com", customers.get(2831).getWeb());
	}
}
