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

@Tag("30")
class Record_1742 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1742: FirstName is Abby")
	void FirstNameOfRecord1742() {
		assertEquals("Abby", customers.get(1741).getFirstName());
	}

	@Test
	@DisplayName("Record 1742: LastName is Desmond")
	void LastNameOfRecord1742() {
		assertEquals("Desmond", customers.get(1741).getLastName());
	}

	@Test
	@DisplayName("Record 1742: Company is Quaker City Engine Rbldrs Inc")
	void CompanyOfRecord1742() {
		assertEquals("Quaker City Engine Rbldrs Inc", customers.get(1741).getCompany());
	}

	@Test
	@DisplayName("Record 1742: Address is 21366 S Alameda St")
	void AddressOfRecord1742() {
		assertEquals("21366 S Alameda St", customers.get(1741).getAddress());
	}

	@Test
	@DisplayName("Record 1742: City is Long Beach")
	void CityOfRecord1742() {
		assertEquals("Long Beach", customers.get(1741).getCity());
	}

	@Test
	@DisplayName("Record 1742: County is Los Angeles")
	void CountyOfRecord1742() {
		assertEquals("Los Angeles", customers.get(1741).getCounty());
	}

	@Test
	@DisplayName("Record 1742: State is CA")
	void StateOfRecord1742() {
		assertEquals("CA", customers.get(1741).getState());
	}

	@Test
	@DisplayName("Record 1742: ZIP is 90810")
	void ZIPOfRecord1742() {
		assertEquals("90810", customers.get(1741).getZIP());
	}

	@Test
	@DisplayName("Record 1742: Phone is 562-549-3957")
	void PhoneOfRecord1742() {
		assertEquals("562-549-3957", customers.get(1741).getPhone());
	}

	@Test
	@DisplayName("Record 1742: Fax is 562-549-3397")
	void FaxOfRecord1742() {
		assertEquals("562-549-3397", customers.get(1741).getFax());
	}

	@Test
	@DisplayName("Record 1742: Email is abby@desmond.com")
	void EmailOfRecord1742() {
		assertEquals("abby@desmond.com", customers.get(1741).getEmail());
	}

	@Test
	@DisplayName("Record 1742: Web is http://www.abbydesmond.com")
	void WebOfRecord1742() {
		assertEquals("http://www.abbydesmond.com", customers.get(1741).getWeb());
	}
}
