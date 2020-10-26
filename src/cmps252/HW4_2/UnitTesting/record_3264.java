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
class Record_3264 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3264: FirstName is Colton")
	void FirstNameOfRecord3264() {
		assertEquals("Colton", customers.get(3263).getFirstName());
	}

	@Test
	@DisplayName("Record 3264: LastName is Budge")
	void LastNameOfRecord3264() {
		assertEquals("Budge", customers.get(3263).getLastName());
	}

	@Test
	@DisplayName("Record 3264: Company is Loyola College Book Store")
	void CompanyOfRecord3264() {
		assertEquals("Loyola College Book Store", customers.get(3263).getCompany());
	}

	@Test
	@DisplayName("Record 3264: Address is 6917 Ryan Dr")
	void AddressOfRecord3264() {
		assertEquals("6917 Ryan Dr", customers.get(3263).getAddress());
	}

	@Test
	@DisplayName("Record 3264: City is Austin")
	void CityOfRecord3264() {
		assertEquals("Austin", customers.get(3263).getCity());
	}

	@Test
	@DisplayName("Record 3264: County is Travis")
	void CountyOfRecord3264() {
		assertEquals("Travis", customers.get(3263).getCounty());
	}

	@Test
	@DisplayName("Record 3264: State is TX")
	void StateOfRecord3264() {
		assertEquals("TX", customers.get(3263).getState());
	}

	@Test
	@DisplayName("Record 3264: ZIP is 78757")
	void ZIPOfRecord3264() {
		assertEquals("78757", customers.get(3263).getZIP());
	}

	@Test
	@DisplayName("Record 3264: Phone is 512-458-7168")
	void PhoneOfRecord3264() {
		assertEquals("512-458-7168", customers.get(3263).getPhone());
	}

	@Test
	@DisplayName("Record 3264: Fax is 512-458-7614")
	void FaxOfRecord3264() {
		assertEquals("512-458-7614", customers.get(3263).getFax());
	}

	@Test
	@DisplayName("Record 3264: Email is colton@budge.com")
	void EmailOfRecord3264() {
		assertEquals("colton@budge.com", customers.get(3263).getEmail());
	}

	@Test
	@DisplayName("Record 3264: Web is http://www.coltonbudge.com")
	void WebOfRecord3264() {
		assertEquals("http://www.coltonbudge.com", customers.get(3263).getWeb());
	}
}
