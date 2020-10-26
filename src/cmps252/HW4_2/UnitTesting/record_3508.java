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

@Tag("4")
class Record_3508 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3508: FirstName is Lakesha")
	void FirstNameOfRecord3508() {
		assertEquals("Lakesha", customers.get(3507).getFirstName());
	}

	@Test
	@DisplayName("Record 3508: LastName is Wessinger")
	void LastNameOfRecord3508() {
		assertEquals("Wessinger", customers.get(3507).getLastName());
	}

	@Test
	@DisplayName("Record 3508: Company is Morgan, Kim Esq")
	void CompanyOfRecord3508() {
		assertEquals("Morgan, Kim Esq", customers.get(3507).getCompany());
	}

	@Test
	@DisplayName("Record 3508: Address is 8980 N Dixie Dr")
	void AddressOfRecord3508() {
		assertEquals("8980 N Dixie Dr", customers.get(3507).getAddress());
	}

	@Test
	@DisplayName("Record 3508: City is Dayton")
	void CityOfRecord3508() {
		assertEquals("Dayton", customers.get(3507).getCity());
	}

	@Test
	@DisplayName("Record 3508: County is Montgomery")
	void CountyOfRecord3508() {
		assertEquals("Montgomery", customers.get(3507).getCounty());
	}

	@Test
	@DisplayName("Record 3508: State is OH")
	void StateOfRecord3508() {
		assertEquals("OH", customers.get(3507).getState());
	}

	@Test
	@DisplayName("Record 3508: ZIP is 45414")
	void ZIPOfRecord3508() {
		assertEquals("45414", customers.get(3507).getZIP());
	}

	@Test
	@DisplayName("Record 3508: Phone is 937-898-6091")
	void PhoneOfRecord3508() {
		assertEquals("937-898-6091", customers.get(3507).getPhone());
	}

	@Test
	@DisplayName("Record 3508: Fax is 937-898-2536")
	void FaxOfRecord3508() {
		assertEquals("937-898-2536", customers.get(3507).getFax());
	}

	@Test
	@DisplayName("Record 3508: Email is lakesha@wessinger.com")
	void EmailOfRecord3508() {
		assertEquals("lakesha@wessinger.com", customers.get(3507).getEmail());
	}

	@Test
	@DisplayName("Record 3508: Web is http://www.lakeshawessinger.com")
	void WebOfRecord3508() {
		assertEquals("http://www.lakeshawessinger.com", customers.get(3507).getWeb());
	}
}
