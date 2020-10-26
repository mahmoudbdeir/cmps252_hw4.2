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
class Record_1678 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1678: FirstName is Glen")
	void FirstNameOfRecord1678() {
		assertEquals("Glen", customers.get(1677).getFirstName());
	}

	@Test
	@DisplayName("Record 1678: LastName is Kolosky")
	void LastNameOfRecord1678() {
		assertEquals("Kolosky", customers.get(1677).getLastName());
	}

	@Test
	@DisplayName("Record 1678: Company is American Management Systs Inc")
	void CompanyOfRecord1678() {
		assertEquals("American Management Systs Inc", customers.get(1677).getCompany());
	}

	@Test
	@DisplayName("Record 1678: Address is 108 N Washington Ave  #-1202")
	void AddressOfRecord1678() {
		assertEquals("108 N Washington Ave  #-1202", customers.get(1677).getAddress());
	}

	@Test
	@DisplayName("Record 1678: City is Scranton")
	void CityOfRecord1678() {
		assertEquals("Scranton", customers.get(1677).getCity());
	}

	@Test
	@DisplayName("Record 1678: County is Lackawanna")
	void CountyOfRecord1678() {
		assertEquals("Lackawanna", customers.get(1677).getCounty());
	}

	@Test
	@DisplayName("Record 1678: State is PA")
	void StateOfRecord1678() {
		assertEquals("PA", customers.get(1677).getState());
	}

	@Test
	@DisplayName("Record 1678: ZIP is 18503")
	void ZIPOfRecord1678() {
		assertEquals("18503", customers.get(1677).getZIP());
	}

	@Test
	@DisplayName("Record 1678: Phone is 570-342-6006")
	void PhoneOfRecord1678() {
		assertEquals("570-342-6006", customers.get(1677).getPhone());
	}

	@Test
	@DisplayName("Record 1678: Fax is 570-342-3745")
	void FaxOfRecord1678() {
		assertEquals("570-342-3745", customers.get(1677).getFax());
	}

	@Test
	@DisplayName("Record 1678: Email is glen@kolosky.com")
	void EmailOfRecord1678() {
		assertEquals("glen@kolosky.com", customers.get(1677).getEmail());
	}

	@Test
	@DisplayName("Record 1678: Web is http://www.glenkolosky.com")
	void WebOfRecord1678() {
		assertEquals("http://www.glenkolosky.com", customers.get(1677).getWeb());
	}
}
