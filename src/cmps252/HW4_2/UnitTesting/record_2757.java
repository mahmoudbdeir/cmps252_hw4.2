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
class Record_2757 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2757: FirstName is Steve")
	void FirstNameOfRecord2757() {
		assertEquals("Steve", customers.get(2756).getFirstName());
	}

	@Test
	@DisplayName("Record 2757: LastName is Batlis")
	void LastNameOfRecord2757() {
		assertEquals("Batlis", customers.get(2756).getLastName());
	}

	@Test
	@DisplayName("Record 2757: Company is Century 21 Lawton Real Est Co")
	void CompanyOfRecord2757() {
		assertEquals("Century 21 Lawton Real Est Co", customers.get(2756).getCompany());
	}

	@Test
	@DisplayName("Record 2757: Address is 55 Walman Ave")
	void AddressOfRecord2757() {
		assertEquals("55 Walman Ave", customers.get(2756).getAddress());
	}

	@Test
	@DisplayName("Record 2757: City is Clifton")
	void CityOfRecord2757() {
		assertEquals("Clifton", customers.get(2756).getCity());
	}

	@Test
	@DisplayName("Record 2757: County is Passaic")
	void CountyOfRecord2757() {
		assertEquals("Passaic", customers.get(2756).getCounty());
	}

	@Test
	@DisplayName("Record 2757: State is NJ")
	void StateOfRecord2757() {
		assertEquals("NJ", customers.get(2756).getState());
	}

	@Test
	@DisplayName("Record 2757: ZIP is 7011")
	void ZIPOfRecord2757() {
		assertEquals("7011", customers.get(2756).getZIP());
	}

	@Test
	@DisplayName("Record 2757: Phone is 973-340-0611")
	void PhoneOfRecord2757() {
		assertEquals("973-340-0611", customers.get(2756).getPhone());
	}

	@Test
	@DisplayName("Record 2757: Fax is 973-340-7509")
	void FaxOfRecord2757() {
		assertEquals("973-340-7509", customers.get(2756).getFax());
	}

	@Test
	@DisplayName("Record 2757: Email is steve@batlis.com")
	void EmailOfRecord2757() {
		assertEquals("steve@batlis.com", customers.get(2756).getEmail());
	}

	@Test
	@DisplayName("Record 2757: Web is http://www.stevebatlis.com")
	void WebOfRecord2757() {
		assertEquals("http://www.stevebatlis.com", customers.get(2756).getWeb());
	}
}
