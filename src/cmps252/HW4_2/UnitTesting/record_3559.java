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

@Tag("39")
class Record_3559 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3559: FirstName is Boris")
	void FirstNameOfRecord3559() {
		assertEquals("Boris", customers.get(3558).getFirstName());
	}

	@Test
	@DisplayName("Record 3559: LastName is Dilella")
	void LastNameOfRecord3559() {
		assertEquals("Dilella", customers.get(3558).getLastName());
	}

	@Test
	@DisplayName("Record 3559: Company is E A Davis Karey Bkpg & Tax Svc")
	void CompanyOfRecord3559() {
		assertEquals("E A Davis Karey Bkpg & Tax Svc", customers.get(3558).getCompany());
	}

	@Test
	@DisplayName("Record 3559: Address is 2921 W Culver St  #-1")
	void AddressOfRecord3559() {
		assertEquals("2921 W Culver St  #-1", customers.get(3558).getAddress());
	}

	@Test
	@DisplayName("Record 3559: City is Phoenix")
	void CityOfRecord3559() {
		assertEquals("Phoenix", customers.get(3558).getCity());
	}

	@Test
	@DisplayName("Record 3559: County is Maricopa")
	void CountyOfRecord3559() {
		assertEquals("Maricopa", customers.get(3558).getCounty());
	}

	@Test
	@DisplayName("Record 3559: State is AZ")
	void StateOfRecord3559() {
		assertEquals("AZ", customers.get(3558).getState());
	}

	@Test
	@DisplayName("Record 3559: ZIP is 85009")
	void ZIPOfRecord3559() {
		assertEquals("85009", customers.get(3558).getZIP());
	}

	@Test
	@DisplayName("Record 3559: Phone is 602-483-4668")
	void PhoneOfRecord3559() {
		assertEquals("602-483-4668", customers.get(3558).getPhone());
	}

	@Test
	@DisplayName("Record 3559: Fax is 602-483-3774")
	void FaxOfRecord3559() {
		assertEquals("602-483-3774", customers.get(3558).getFax());
	}

	@Test
	@DisplayName("Record 3559: Email is boris@dilella.com")
	void EmailOfRecord3559() {
		assertEquals("boris@dilella.com", customers.get(3558).getEmail());
	}

	@Test
	@DisplayName("Record 3559: Web is http://www.borisdilella.com")
	void WebOfRecord3559() {
		assertEquals("http://www.borisdilella.com", customers.get(3558).getWeb());
	}
}
