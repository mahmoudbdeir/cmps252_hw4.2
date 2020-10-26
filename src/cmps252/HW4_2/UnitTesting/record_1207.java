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

@Tag("2")
class Record_1207 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1207: FirstName is Mable")
	void FirstNameOfRecord1207() {
		assertEquals("Mable", customers.get(1206).getFirstName());
	}

	@Test
	@DisplayName("Record 1207: LastName is Cosner")
	void LastNameOfRecord1207() {
		assertEquals("Cosner", customers.get(1206).getLastName());
	}

	@Test
	@DisplayName("Record 1207: Company is Mail Boxes Etc")
	void CompanyOfRecord1207() {
		assertEquals("Mail Boxes Etc", customers.get(1206).getCompany());
	}

	@Test
	@DisplayName("Record 1207: Address is 435 Eldora St")
	void AddressOfRecord1207() {
		assertEquals("435 Eldora St", customers.get(1206).getAddress());
	}

	@Test
	@DisplayName("Record 1207: City is Wichita")
	void CityOfRecord1207() {
		assertEquals("Wichita", customers.get(1206).getCity());
	}

	@Test
	@DisplayName("Record 1207: County is Sedgwick")
	void CountyOfRecord1207() {
		assertEquals("Sedgwick", customers.get(1206).getCounty());
	}

	@Test
	@DisplayName("Record 1207: State is KS")
	void StateOfRecord1207() {
		assertEquals("KS", customers.get(1206).getState());
	}

	@Test
	@DisplayName("Record 1207: ZIP is 67202")
	void ZIPOfRecord1207() {
		assertEquals("67202", customers.get(1206).getZIP());
	}

	@Test
	@DisplayName("Record 1207: Phone is 316-264-2969")
	void PhoneOfRecord1207() {
		assertEquals("316-264-2969", customers.get(1206).getPhone());
	}

	@Test
	@DisplayName("Record 1207: Fax is 316-264-7033")
	void FaxOfRecord1207() {
		assertEquals("316-264-7033", customers.get(1206).getFax());
	}

	@Test
	@DisplayName("Record 1207: Email is mable@cosner.com")
	void EmailOfRecord1207() {
		assertEquals("mable@cosner.com", customers.get(1206).getEmail());
	}

	@Test
	@DisplayName("Record 1207: Web is http://www.mablecosner.com")
	void WebOfRecord1207() {
		assertEquals("http://www.mablecosner.com", customers.get(1206).getWeb());
	}
}
