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

@Tag("32")
class Record_1476 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1476: FirstName is Christopher")
	void FirstNameOfRecord1476() {
		assertEquals("Christopher", customers.get(1475).getFirstName());
	}

	@Test
	@DisplayName("Record 1476: LastName is Feret")
	void LastNameOfRecord1476() {
		assertEquals("Feret", customers.get(1475).getLastName());
	}

	@Test
	@DisplayName("Record 1476: Company is Dennis C Atwell & Assocs Inc")
	void CompanyOfRecord1476() {
		assertEquals("Dennis C Atwell & Assocs Inc", customers.get(1475).getCompany());
	}

	@Test
	@DisplayName("Record 1476: Address is 123 Arthur St")
	void AddressOfRecord1476() {
		assertEquals("123 Arthur St", customers.get(1475).getAddress());
	}

	@Test
	@DisplayName("Record 1476: City is Manistee")
	void CityOfRecord1476() {
		assertEquals("Manistee", customers.get(1475).getCity());
	}

	@Test
	@DisplayName("Record 1476: County is Manistee")
	void CountyOfRecord1476() {
		assertEquals("Manistee", customers.get(1475).getCounty());
	}

	@Test
	@DisplayName("Record 1476: State is MI")
	void StateOfRecord1476() {
		assertEquals("MI", customers.get(1475).getState());
	}

	@Test
	@DisplayName("Record 1476: ZIP is 49660")
	void ZIPOfRecord1476() {
		assertEquals("49660", customers.get(1475).getZIP());
	}

	@Test
	@DisplayName("Record 1476: Phone is 231-723-6892")
	void PhoneOfRecord1476() {
		assertEquals("231-723-6892", customers.get(1475).getPhone());
	}

	@Test
	@DisplayName("Record 1476: Fax is 231-723-6074")
	void FaxOfRecord1476() {
		assertEquals("231-723-6074", customers.get(1475).getFax());
	}

	@Test
	@DisplayName("Record 1476: Email is christopher@feret.com")
	void EmailOfRecord1476() {
		assertEquals("christopher@feret.com", customers.get(1475).getEmail());
	}

	@Test
	@DisplayName("Record 1476: Web is http://www.christopherferet.com")
	void WebOfRecord1476() {
		assertEquals("http://www.christopherferet.com", customers.get(1475).getWeb());
	}
}
