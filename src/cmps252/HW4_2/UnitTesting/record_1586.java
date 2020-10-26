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
class Record_1586 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1586: FirstName is Retha")
	void FirstNameOfRecord1586() {
		assertEquals("Retha", customers.get(1585).getFirstName());
	}

	@Test
	@DisplayName("Record 1586: LastName is Cribbs")
	void LastNameOfRecord1586() {
		assertEquals("Cribbs", customers.get(1585).getLastName());
	}

	@Test
	@DisplayName("Record 1586: Company is Atc Environmental")
	void CompanyOfRecord1586() {
		assertEquals("Atc Environmental", customers.get(1585).getCompany());
	}

	@Test
	@DisplayName("Record 1586: Address is 71 S Newtown St")
	void AddressOfRecord1586() {
		assertEquals("71 S Newtown St", customers.get(1585).getAddress());
	}

	@Test
	@DisplayName("Record 1586: City is Newtown Square")
	void CityOfRecord1586() {
		assertEquals("Newtown Square", customers.get(1585).getCity());
	}

	@Test
	@DisplayName("Record 1586: County is Delaware")
	void CountyOfRecord1586() {
		assertEquals("Delaware", customers.get(1585).getCounty());
	}

	@Test
	@DisplayName("Record 1586: State is PA")
	void StateOfRecord1586() {
		assertEquals("PA", customers.get(1585).getState());
	}

	@Test
	@DisplayName("Record 1586: ZIP is 19073")
	void ZIPOfRecord1586() {
		assertEquals("19073", customers.get(1585).getZIP());
	}

	@Test
	@DisplayName("Record 1586: Phone is 610-356-3748")
	void PhoneOfRecord1586() {
		assertEquals("610-356-3748", customers.get(1585).getPhone());
	}

	@Test
	@DisplayName("Record 1586: Fax is 610-356-1277")
	void FaxOfRecord1586() {
		assertEquals("610-356-1277", customers.get(1585).getFax());
	}

	@Test
	@DisplayName("Record 1586: Email is retha@cribbs.com")
	void EmailOfRecord1586() {
		assertEquals("retha@cribbs.com", customers.get(1585).getEmail());
	}

	@Test
	@DisplayName("Record 1586: Web is http://www.rethacribbs.com")
	void WebOfRecord1586() {
		assertEquals("http://www.rethacribbs.com", customers.get(1585).getWeb());
	}
}
